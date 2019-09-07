/**
 * 
 */
package com.png.cgi.services;

import org.springframework.stereotype.Service;

import com.png.cgi.dao.UserDaoImpl;
import com.png.cgi.model.UserDetails;

/**
 * @author anil.padigela
 *
 */
@Service
public class UserDetailServiceImpl implements IUserDetailService{

	@Override
	public UserDetails registration(UserDetails user) {
		UserDaoImpl userDAO = new UserDaoImpl();
		return userDAO.registration(user);
		 
	}

	@Override
	public UserDetails validateLogin(UserDetails user) {
		UserDaoImpl userDAO = new UserDaoImpl();
		return userDAO.validateLogin(user);
	}
	
	

}
