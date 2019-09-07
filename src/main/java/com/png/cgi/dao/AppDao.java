/**
 * 
 */
package com.png.cgi.dao;

/**
 * @author anil.padigela
 *
 */


import java.sql.Connection;
import java.sql.Statement;

import org.springframework.context.annotation.Configuration;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
@Configuration
public class AppDao {
	
	public Connection getDao() {
		
		
		 String hostName = "envision072server.database.windows.net"; // update me
	        String dbName = "pngDB"; // update me
	        String user = "kiranmai.panthangi"; // update me
	        String password = "Sep@2019"; // update me
	        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
	            + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
	        Connection connection = null;

	        try {
	            connection = DriverManager.getConnection(url);
	            String schema = connection.getSchema();
	          
	        }
	           	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        return connection;
	       
	}

}
