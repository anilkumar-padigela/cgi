/**
 * 
 */
package com.png.cgi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.png.cgi.model.Location;
import com.png.cgi.model.Store;

/**
 * @author anil.padigela
 *
 */


public class LocationDaoImpl extends AppDao{
	
	
	
	public List<Store> getStores(Location location) {
		
		
		//Statement statement = this.getDao().createStatement();
  
		 List<Store> stores = new ArrayList<Store>();

        try {
        	// connection = ;
		     
        String sql = "select Shop_Id, ShopName from dbo.Store where location_id= "+location.getLocationId();
        Statement statement = this.getDao().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
               System.out.println("Top 20 categories:");
         while (resultSet.next())
         {
        	 Store store = new Store();
        	 store.setStoreId(resultSet.getString("Shop_Id"));
        	 store.setStoreName(resultSet.getString("ShopName"));
        	 stores.add(store);
             System.out.println(resultSet.getString(1) + " "
                 + resultSet.getString(2));
         }
        
        		
        		
        			    this.getDao().close();
        			  } 
        			  catch (SQLException se)
        			  {
        			    System.out.println("Return User"+se);
        			    location = null;
        			  }
        			  
        		System.out.println("Top 20 categories:");
       
		return stores;
	}
	
        
		
	

}