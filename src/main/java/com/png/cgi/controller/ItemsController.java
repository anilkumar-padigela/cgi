/**
 * 
 */
package com.png.cgi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.png.cgi.model.Store;
import com.png.cgi.model.Item;
import com.png.cgi.model.UserDetails;

/**
 * @author anil.padigela
 *
 */
@RestController
public class ItemsController {

	
	@PostMapping(value="/getItems")
    public List<Item> registration(@RequestBody Store store) {  
		List <Item>  itemList = new  ArrayList<Item>();	
		return itemList;
			
	}	

	
}
