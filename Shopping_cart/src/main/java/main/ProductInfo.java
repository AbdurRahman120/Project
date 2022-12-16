package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductInfo {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_cart","root",null);
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery("Select * from products");
			
			while(rs.next()) {
				System.out.println("ID"+rs.getInt(1)+"Name "+rs.getString(2)+"Category "+rs.getString(3)+"Price "+rs.getDouble(4)+"Image "+rs.getString(5));
				
			}
			con.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}

	}
	}


