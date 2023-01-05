<%@ page import="main.*" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>E-Commerce Cart</title>

<style>
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    list-style: none;
    text-decoration: none;
}

header{
    background-color: white;
    color: white;
    height: 12vh;
}
nav {
    
}
ul {
    display: flex;
    align-items: center;
    justify-content:flex-end;
}
ul li {
    color: blacl;
    padding: 20px 40px 0px 0px;
    font-family: 'Lato', sans-serif;
}


ul li:hover {
    font-weight: bolder;
    font-size: 16px;

}

h1{
text-align:center;
margin-top:20px;
}
column{
margin-top:50px;
}

.container {
width: 100vw;
height: 100vh;
font-size: 16px;
line-height: 1.4;
letter-spacing: 0.002em;
font-weight: 400;
font-style: normal;
}

.card-header{

font-size: 30px;
text-align: center;
text-transform: capitalize;
text-decoration: underline;
}

.cards{
width: 14rem;
text-align: center;
border: 0.2px solid #d2d2d2;
}
.card title{
z-index:1;
font-size:17px;
margin-top:-15px
}

.price{
font-size:14px;
}

button{
color: white;
background-color:red;
font-size: 17px;
border-radius: 2px;
}
img{

width: 16.5rem;
}

.card-body{
position: relative;
top: -20px;
}

</style>

<header>
<nav>
<ul>
<li>Home
<li>About
<li>Contact
<li>Login
<li>Sign-up
</ul>
</nav>
</header>
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
<%
AddProduct ap = new AddProductProxy().getAddProduct();
String id = request.getParameter("Id");
System.out.println("Id : " + id);
Integer idd  =Integer.parseInt(id);
String name=request.getParameter("Name");
String description=request.getParameter("Description");
String type=request.getParameter("Type");
String cid=request.getParameter("CategoryID");
System.out.println("CategoryId : " + cid);
Integer categoryID = Integer.parseInt(cid);
String siz = request.getParameter("Size");
System.out.println("Size : " + siz);
Float size =Float.parseFloat(siz) ;
String weigh= request.getParameter("Weight");
System.out.println("Weight : " + weigh);
Float weight =Float.parseFloat(weigh) ;
String color=request.getParameter("Color");
String sc=request.getParameter("StandardCost");
System.out.println("StandardCost : " + sc);
Integer standardCost = Integer.parseInt(sc);
String lp=request.getParameter("ListPrice");
System.out.println("ListPrice : " + lp);
Integer listPrice = Integer.parseInt(lp);
ap.addProductInfo(name, description, type, categoryID, size, weight, color, standardCost, listPrice);

%>







<h1>Welcome To E-Commerce Cart</h1>
<br/>
<a href="AddProduct.jsp"><button>Add Product</button></a>

<div class="container">
<div class="card-header">All Products</div>
<div class="row">
  
   <div class="column">
   <div class="cards" style="width: 18rem;">
  <img class="card-img-top" src="images/101.jpg" alt="Card image cap">
  <div class="card-body">
  
<%

FetchProducts app2 = new FetchProductsProxy().getFetchProducts();
Products[] app = app2.getproductInfo();

%>
    <h5 class="card-title"><%=app[0].getName() %></h5>
    <h6 class="price"><%=app[0].getPrice() %></h6>
<% 

%>
   <div >
     <a href="#" ><button class="btn btn-danger" style="padding:0px 3px">Add-To-Cart</button></a>
       <a href="BuyNow.jsp" ><button class="btn btn-danger" style="padding:0px 6px">Buy Now</button></a>
   </div>
  
  </div>
  
 
  
</div>S
   </div>
</div>

</div>
</body>
</html>