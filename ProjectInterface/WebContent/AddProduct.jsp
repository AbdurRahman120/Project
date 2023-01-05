<%@ page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="head.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>

<%
AddCustomer ac = new AddCustomerProxy().getAddCustomer();
String name2=request.getParameter("Name");
System.out.println(name2);
String phoneno=request.getParameter("PhoneNumber");
String Cnic=request.getParameter("CNIC");
String email=request.getParameter("Email");
String gender = request.getParameter("Gender");

ac.addCustomerInfo(name2, phoneno, Cnic, email, gender);

%>




<h2>Enter Following Details</h2>
<form action="HomePage.jsp" >
<div class ="container">
<div class="container1">
<div class="items">
</br>
<label class="label-control">Enter Product Id</label>
<input class="form-control" style = "margin:-3px" name="Id" type = "text" ></input>
<br>
<br>
<label class="label-control">Enter Product Name</label>
<input class="form-control" name="Name" type = "text" ></input>
</br>
<br>
<div class="textarea">
<label class="label-control">Enter Product Description</label>
<textarea class="form-control" name="Description" rows="5" cols="33" ></textarea>
</div>
</br>
<br>
<label class="label-control">Enter Product Type</label>
  <input class="form-control" name="Type" type = "text"></input>
<br>s
<br>
<label class="label-control">Select Category ID</label>
 <select style="margin-left:2px" name="CategoryID">
<option ></option>
<option value="101">101</option>
<option value="102">102</option>
</select>
<br>
<br>
<label class="label-control">Enter Product Size</label>
<input class="form-control" style="margin-left:3px" name="Size" type = "text" ></input>
<br>
<br>
<label  class="label-control">Enter Product Weight</label>
  <input class="form-control"  style="margin-left:3.5px" name="Weight" type = "text" ></input>
<br>
<br>
<label  class="label-control">Enter Product Color</label>
 <input class="form-control"  style="margin-left:5px" name="Color" type = "text" ></input>
<br>
<br>
<label  class="label-control">Enter Standard-Cost</label>
<input class="form-control" style="margin-left:5px" name="StandardCost" type = "text" "></input>
<br>
<br>
<label>Enter ListPrice</label>
<input class="form-control" style="margin-left:5px" name="ListPrice" type = "text" "></input>
<br>
<br>
<button type="submit">Add Product</button>
</div>
</div>
</div>
</form>

</body>
</html>