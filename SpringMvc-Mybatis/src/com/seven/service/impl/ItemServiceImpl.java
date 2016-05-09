package com.seven.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seven.mapper.ItemsMapper;
import com.seven.mapper.ItemsMapperCustom;
import com.seven.model.Items;
import com.seven.model.ItemsCustom;
import com.seven.model.ItemsQueryVo;
import com.seven.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	public List<ItemsCustom> getItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception {
		return itemsMapperCustom.getItemsList(itemsQueryVo);
	}

	public ItemsCustom selectByPrimaryKey(Integer id) throws Exception {
		Items items = itemsMapper.selectByPrimaryKey(id);
		//对商品的业务处理
		/*...........*/
		ItemsCustom itemsCustom = new ItemsCustom();
		//将items的属性值拷贝到itemsCustom
		BeanUtils.copyProperties(items, itemsCustom);
		
		return itemsCustom;
	}

}
