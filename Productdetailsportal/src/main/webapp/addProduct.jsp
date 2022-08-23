<%@page import="java.util.*,com.bean.ProductDetails" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int pid;String pname;float price; %>
<%
int pid = Integer.parseInt(request.getParameter("pid"));
String pname = request.getParameter("pname");
float price = Float.parseFloat(request.getParameter("price"));
ProductDetails pro=new ProductDetails();
pro.setPid(pid);
pro.setPname(pname);
pro.setPrice(price);
List<ProductDetails>list=new ArrayList<ProductDetails>();
Object obj=session.getAttribute("obj");
if(obj==null){
	pid = Integer.parseInt(request.getParameter("pid"));
	pname = request.getParameter("pname");
	price = Float.parseFloat(request.getParameter("price"));
	list.add(pro);
	session.setAttribute("obj",list);
	for(ProductDetails s:list){
		out.println(s);
	}

}else{
	pid = Integer.parseInt(request.getParameter("pid"));
	pname = request.getParameter("pname");
	price = Float.parseFloat(request.getParameter("price"));
	list=(List<ProductDetails>)session.getAttribute("obj");
	list.add(pro);
	for(ProductDetails s:list){
		out.println(s+"<br>");
	}
}
%>

<%@include file="index.html" %>
</body>
</html>
