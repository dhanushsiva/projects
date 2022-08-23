package com.service;
import com.bean.Product1;
import com.dao.ProductDao;
public class ProductService {
ProductDao pd = new ProductDao();
public String storeProduct(Product1 p) {
if(pd.storeProduct(p)>0) {
return "product added successfully";
}else {
return "Product id must be unique.Use unique id to create unique products";
}
}
}
