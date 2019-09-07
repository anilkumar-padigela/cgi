/**
 * 
 */
package com.png.cgi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.png.cgi.model.UserDetails;

/**
 * @author anil.padigela
 *
 */


public class UserDaoImpl extends AppDao{
	
	
	
	public UserDetails registration(UserDetails user) {
		
		
		//Statement statement = this.getDao().createStatement();
  
        
        
        //String sql = " INSERT INTO dbo.UserRegistration values("8","kiranmai","panthangi","kiran","panthangi","kpanthanig@gmail.com"
        	
        		
        		String query = "INSERT INTO dbo.UserRegistration ("
        			    + " id,"
        			    + " userName,password,"
        			    + " firstName,"
        			    + " lastName,"
        			    + " email,"
        			    + " mobile,"
        			    + " location ) VALUES ("
        			    + "null, ?, ?, ?, ?, ?, ?, ?)";

        			  try {
        			    // set all the preparedstatement parameters
        			    PreparedStatement st = this.getDao().prepareStatement(query);
        			    st.setInt(1, 0);
        			    st.setString(2, user.getUserName());
        			    st.setString(3, user.getPassword());
        			    st.setString(4, user.getFirstName());
        			    st.setString(4, user.getLastName());
        			    st.setString(5, user.getEmail());
        			    st.setString(6, user.getMobile());
        			    st.setString(7, user.getLocation());

        			    // execute the preparedstatement insert
        			    st.executeUpdate();
        			    st.close();
        			    this.getDao().close();
        			  } 
        			  catch (SQLException se)
        			  {
        			    System.out.println("Return User"+se);
        			    user = null;
        			  }
        			  
        		System.out.println("Top 20 categories:");
       
		return user;
	}
	
	public UserDetails validateLogin(UserDetails user) {
		

        // Create and execute a SELECT SQL statement.
        String selectSql = "SELECT * from dbo.UserRegistration where username = ";
        
        Statement statement;
		try {
			statement = this.getDao().createStatement();
		
        ResultSet resultSet = statement.executeQuery(selectSql);
        //System.out.println("Top 20 categories:");
         while (resultSet.next())
         {
             System.out.println(resultSet.getString(1) + " "
                 + resultSet.getString(2));
         }
         this.getDao().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			user = null;
		}
         return user;
     }
        
		
	

}