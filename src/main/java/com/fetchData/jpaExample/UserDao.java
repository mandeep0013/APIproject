package com.fetchData.jpaExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	private final static String JDBC_DRIVER =  "com.mysql.cj.jdbc.Driver";
	private final static String DB_URL ="jdbc:mysql://database-2.c6mm7w1r6wmu.us-west-1.rds.amazonaws.com:3306/awsdatabase";
	private final static String USER = "admin";
	private final static String PASSWORD = "testpassword";
	private static Connection conn = null;
	private static java.sql.Statement stmt = null;
List<daoPattern> accno;
	
	public UserDao() {
		accno = new ArrayList<daoPattern>();
		
	}
	public void deleteAccono(daoPattern Accno) {
		
		
		
	}
	
	public List<daoPattern> getAllAccno(){
		System.out.println("Connecting to Database");	
		try
		{
			Class.forName(JDBC_DRIVER);	
			conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
			
stmt = conn.createStatement();
			
			String sql = "SELECT * FROM customer_table";
			ResultSet result = stmt.executeQuery(sql);
			
			while(result.next())
			{
				daoPattern user = new daoPattern();
				user.setFirstname(result.getString("firstname"));
				user.setLastname(result.getString("lastname"));
				user.setCustomer_id(result.getInt("customer_id"));
				user.setPhoneno(result.getString("phoneno"));
				user.setEmail(result.getString("email"));
			
				accno.add(user);
			
		}
		}		

		catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection Close");
			e.printStackTrace();
		}
		return accno;
	}
	
	public daoPattern getAccno(int name) {
		return accno.get(name);
	}
	
	public void updateAccno(daoPattern Accno) {
	
	}
	
}


