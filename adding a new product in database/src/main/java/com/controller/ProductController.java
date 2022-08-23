
package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.Product1;
import com.service.ProductService;
/**
* Servlet implementation class ProductController
*/
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
private static final long serialVersionUID = 1L;
/**
* @see HttpServlet#HttpServlet()
*/
public ProductController() {
super();
// TODO Auto-generated constructor stub
}
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
// TODO Auto-generated method stub
response.getWriter().append("Served at:").append(request.getContextPath());
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
// TODO Auto-generated method stub
//doGet(request, response);
PrintWriter pw = response.getWriter();
int product_id = Integer.parseInt(request.getParameter("p_id"));

String product_name = request.getParameter("p_name");
int price = Integer.parseInt(request.getParameter("p_price"));
Product1 p = new Product1();
p.setProduct_id(product_id);
p.setProduct_name(product_name);

p.setProduct_price(price);
ProductService ps = new ProductService();
String result = ps.storeProduct(p);
pw.println(result);
}}
