package oc_DataBaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class Databaseutility_oc {
Connection con;
	public void getDbConnection()
	{
		String url="jdbc:mysql::/localhost:3307/opencartdb";
		String un="root";
		String pwd="";
		try {
		Driver db=new Driver();
		DriverManager.registerDriver(db);
		con=DriverManager.getConnection(url,un,pwd);
		
		
			
			
		}catch(Exception e)
		{
			
		}
	} 
	
	public void getconnection()
	{
		System.out.println("This method is new ");
	}
	
	public void getconnection2()
	{
		System.out.println("This method is new2 ");
	}
}
