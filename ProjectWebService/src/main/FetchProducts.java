package main;

import java.sql.*;
public class FetchProducts {

	public Products[] getproductInfo() {
		
		 Products[] products = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/eyebuydirect","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT product.Name, product.ListPrice from product ");
           
			rs.last();
			products = new Products[rs.getRow()];
			rs.beforeFirst();
			
			int i = 0;
			
			while(rs.next()) {
				products[i] = new Products();
				products[i].name = rs.getString(1);
	            products[i].price = rs.getDouble(2);
	            i++;
			}
		
			
			con.close();
			
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return products;
	}
}
