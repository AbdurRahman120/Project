package main;


import java.sql.*;


public class FetchNameOfProduct {

	public String getAllProducts(int productid) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/eyebuydirect","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT Name FROM `product`where ProductID = '"+productid+"' \r\n" + 
					"");

		
			rs.next();
			String Roominfo = " " + rs.getString(1);
			
			con.close();
			return Roominfo;
			} catch(Exception e)
			{
			System.out.println(e);
			}
		
		return " ";
	}
}
