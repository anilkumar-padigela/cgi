/**
 * 
 */
package com.png.cgi.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.png.cgi.model.Location;
import com.png.cgi.model.Store;
/**
 * @author anil.padigela
 *
 */

@RestController
public class LocationController {
	
	@PostMapping("/getLocations")
    public List<Location> getLocations() {
       
		List<Location> locationList = new ArrayList<Location>();
		return locationList;
    }	

}
