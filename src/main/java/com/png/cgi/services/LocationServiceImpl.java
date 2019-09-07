/**
 * 
 */
package com.png.cgi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.png.cgi.dao.LocationDaoImpl;
import com.png.cgi.model.Location;
import com.png.cgi.model.Store;

/**
 * @author anil.padigela
 *
 */
@Service
public class LocationServiceImpl implements ILocationService {

	@Override
	public List<Store> getLocation(Location location) {
		// TODO Auto-generated method stub
		LocationDaoImpl locationDAO = new LocationDaoImpl();
		return locationDAO.getStores(location);
		//return get;
	}

}
