package com.bean;

import java.util.ArrayList;

public class ProductDetails {
int pid;
float price;
String pname;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
@Override
public String toString() {
	return "ProductDetails [pid=" + pid + ", price=" + price + ", pname=" + pname + "]";
}

}
