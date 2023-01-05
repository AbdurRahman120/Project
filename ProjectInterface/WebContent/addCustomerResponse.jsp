<%@ page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AddCustomer ac = new AddCustomerProxy().getAddCustomer();
String name2=request.getParameter("Name");
String phoneno=request.getParameter("PhoneNumber");
String Cnic=request.getParameter("CNIC");
String email=request.getParameter("Email");
String gender = request.getParameter("Gender");
String nationality = request.getParameter("Nationality");
out.println(ac.addCustomerInfo(name2, phoneno, Cnic, email, gender, nationality));
%>
</body>
</html>