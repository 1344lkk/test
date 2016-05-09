package com.seven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.seven.model.ItemsCustom;
import com.seven.model.ItemsQueryVo;
import com.seven.service.ItemService;

@RequestMapping("/item")
@Controller
public class ItemsController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/queryItem")
	public ModelAndView getItemList() throws Exception{
		ItemsQueryVo itemsQueryVo = new ItemsQueryVo();
		ItemsCustom itemsCustom = new ItemsCustom();
		itemsCustom.setName("背");
		itemsQueryVo.setItemsCustom(itemsCustom);
		//查询商品列表
		List<ItemsCustom> itemsList = itemService.getItemsList(itemsQueryVo);
		
		//填充数据
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("itemsList");
		
		return modelAndView;
		
	}
	
	@RequestMapping("/editItem")
	public String editItem(Model model,@RequestParam(value="id",required=true,defaultValue="12")Integer item_id){
		System.out.println(item_id);
		return "redirect:queryItem.action";
	}
	
}
