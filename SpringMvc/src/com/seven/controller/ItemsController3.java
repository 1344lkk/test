package com.seven.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.seven.model.Items;

@Controller
public class ItemsController3{
	@RequestMapping("/queryItem3")
	public ModelAndView queryItem(){
		//商品列表
		List<Items> itemsList = new ArrayList<Items>();
		
		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
		items_1.setCreatetime(new Date());
		
		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");
		items_2.setCreatetime(new Date());
		
		itemsList.add(items_1);
		itemsList.add(items_2);
		
		//创建modelAndView填充数据
		ModelAndView modelAndView = new ModelAndView();
		//配置数据
		modelAndView.addObject("itemsList",itemsList);
		//填充视图
		modelAndView.setViewName("itemsList");
		
		return modelAndView;
	}
}
