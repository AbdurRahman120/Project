package main;



import java.sql.*;

public class AddCustomer {

	public String addCustomerInfo(String Name , String PhoneNumber , String CNIC , String Email ,String Gender  ) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/eyebuydirect","root","");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("INSERT into customerinfo(Name,PhoneNo,CNIC,Email ,Gender) VALUES('"+Name+"' ,'"+PhoneNumber+"' ,"
					+ "'"+CNIC+"' , '"+Email+"' , '"+Gender+"' )");

		
			con.close();
			
			} catch(Exception e)
			{
			System.out.println(e);
			}
		
		return "Customer named " + Name +  " added successfully!";
	
	}
}
