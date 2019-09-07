/**
 * 
 */
package com.png.cgi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.png.cgi.model.Store;
/**
 * @author anil.padigela
 *
 */
@RestController
public class StoreController {
	
	@RequestMapping("/getStores")
    public List<Store> getStores() {
       
		List<Store> storeList = new ArrayList<Store>();
		
		Store s1 = new Store();
		s1.setDescription("Grocery");
		storeList.add(s1);
		return storeList;
		
		
		
    }	

}
