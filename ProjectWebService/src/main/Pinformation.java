package main;

import java.sql.*;
public class Pinformation {

	public String getOrderInfo(String Name) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/eyebuydirect","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT product.Name, product.CategoryID , product.Description, product.StandardCost ,"
					+ " product.ListPrice, orderdetails.OrderQty , orderdetails.UnitPrice , orderdetails.UnitPriceDiscount,"
					+ " orderdetails.OrderArrivalDate from `product` "
					+ "join orderdetails on orderdetails.ProductID=product.ProductID "
					+ "join customerinfo on orderdetails.CustomerID=customerinfo.CustomerID "
					+ "where customerinfo.name = '" +Name +"' ;");

		
			rs.next();
			String Roominfo = "Product Name: " + rs.getString(1) + " Product CategoryID: " + rs.getInt(2) + " Description: "
			+ rs.getString(3) + "StandardCost: " + rs.getInt(4) + "List Price: " + rs.getInt(5) +  "Order Qty: " + rs.getInt(6) +
			"Unit Price: " + rs.getInt(7) +  "Unit Price Discount: " + rs.getInt(8) + "Order Arrival Time: " + rs.getString(9);
			
			con.close();
			return Roominfo;
			} catch(Exception e)
			{
			System.out.println(e);
			}
		
		return " ";
	}
}
