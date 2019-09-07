/**
 * 
 */
package com.png.cgi.services;

import java.util.List;

import com.png.cgi.model.Location;

import com.png.cgi.model.Store;

/**
 * @author anil.padigela
 *
 */
public interface IStoreServices {

	
	public List<Store>getStores(Location location);
}
