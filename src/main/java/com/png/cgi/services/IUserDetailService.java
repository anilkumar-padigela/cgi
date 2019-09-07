/**
 * 
 */
package com.png.cgi.services;

import com.png.cgi.model.UserDetails;

/**
 * @author anil.padigela
 *
 */
public interface IUserDetailService {

	
	
  public UserDetails	registration(UserDetails user);
  
  public UserDetails	validateLogin(UserDetails user);
  
}
