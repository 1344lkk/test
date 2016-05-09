package com.seven.mapper;


import java.util.List;

import com.seven.model.ItemsCustom;
import com.seven.model.ItemsQueryVo;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> getItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}