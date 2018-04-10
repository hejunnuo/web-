package com.it.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.it.pojo.TbItem;
import com.it.service.ItemService;



@Controller
public class ItemController {
	
	@Autowired
	 private ItemService itemService;
	  @RequestMapping("item/{id}")
	  @ResponseBody
	  public  TbItem findById(@PathVariable long id){
		  System.out.println(id);
		  return itemService.findById(id);
	  }
	
}
