package com.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bean.Product1;public class ProductDao{
public int storeProduct(Product1 p) {
try {
Configuration con =new Configuration();
con.configure("hibernate.cfg.xml");
SessionFactory sf=con.buildSessionFactory();
Session session=sf.openSession();
Transaction tran =session.getTransaction();
tran.begin();
session.save(p);
tran.commit();
return 1;
}catch(Exception e) {
return 0;
}
}
}
