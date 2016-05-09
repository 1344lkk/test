package com.seven.service;

import java.util.List;

import com.seven.model.ItemsCustom;
import com.seven.model.ItemsQueryVo;

public interface ItemService {
	//查询商品列表
	public List<ItemsCustom> getItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	//查询一件商品
	public ItemsCustom selectByPrimaryKey(Integer id)throws Exception;
}
