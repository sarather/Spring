package com.ritik.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ritik.spring.springorm.product.dao.ProductDao;
import com.ritik.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext contex = new ClassPathXmlApplicationContext(
				"com/ritik/spring/springorm/product/test/config.xml");
		
		ProductDao pd = (ProductDao) contex.getBean("productdao");
		Product product=new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("It is Best");
		product.setPrice(12000.12);
		pd.create(product);
	}

}
