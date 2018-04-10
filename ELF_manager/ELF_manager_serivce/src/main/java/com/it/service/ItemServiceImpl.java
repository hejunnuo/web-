package com.it.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.mapper.TbItemMapper;
import com.it.pojo.TbItem;
import com.it.service.ItemService;

@Service
public class ItemServiceImpl  implements ItemService {

	  @Autowired
	  private TbItemMapper itemMapper;
	  
	@Override
	public TbItem findById(Long id) {
		// TODO Auto-generated method stub
		return itemMapper.selectByPrimaryKey((long) id);
	}
   
	
}
