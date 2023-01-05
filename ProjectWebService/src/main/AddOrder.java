package main;

import java.sql.*;
public class AddOrder {

	public String addProductInfo(String Name , String Description , String Type , int CategoryID , float Size , float Weight , 
			String Color , int StandardCost , int ListPrice) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/eyebuydirect","root","");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into product(Name , Description , Type , CategoryID , Size , Weight , Color, StandardCost , ListPrice) "
					+ "values('"+Name+"' , '"+Description+"' , '"+Type+"' , '"+CategoryID+"' , '"+Size+"' , '"+Weight+"' ,  '"+Color+"' "
							+ ",  '"+StandardCost+"' ,  '"+ListPrice+"');");

		
			
			con.close();
			
			} catch(Exception e)
			{
			System.out.println(e);
			}
		
		return " ";
	
	}
}
