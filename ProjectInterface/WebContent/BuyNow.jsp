<%@ page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>

<%@include file="head.jsp" %>
</head>
<body>


<%
AddCustomer ac = new AddCustomerProxy().getAddCustomer();
String name2=request.getParameter("Name");

String phoneno=request.getParameter("PhoneNumber");
String Cnic=request.getParameter("CNIC");
String email=request.getParameter("Email");
String gender = request.getParameter("Gender");

ac.addCustomerInfo(name2, phoneno, Cnic, email, gender);

%>



<h2>Enter Following Details</h2>
<form action="" >
<div class ="container">
<div class="container1">
<div class="items">
</br>
<label class="label-control">Enter Your Name </label>
<input class="form-control"style = "margin:-3px" name="Name" type = "text" ></input>
<br>
<br>
<label class="label-control">Enter Phone Number</label>
<input class="form-control" name="PhoneNo" type = "text" ></input>
</br>
<br>

</br>
<br>
<label class="label-control">Enter Your CNIC</label>
 <input class="form-control" name="CNIC" type = "text"></input>
<br>

<br>

<br>
<br>
<label class="label-control">Enter Your Email</label>
<input class="form-control" style="margin-left:3px" name="Email" type = "text" ></input>
<br>
<br>
<label>Select Gender</label>
<select style="margin-left:2px" name="Gender">
<option ></option>
<option value="Male">Male</option>
<option value="Female">Female</option>
</select>
<br>
<br>

<button type="submit">Register</button>
</div>
</div>
</div>
</form>

</body>
</html>>