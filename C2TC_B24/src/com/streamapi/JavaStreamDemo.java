package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class JavaStreamDemo {

	public static void main(String[] args) {
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(1,"Television",25000f));
		productList.add(new Product(2,"Fridge",35000f));
		productList.add(new Product(3,"Washing Machine",45000f));
		productList.add(new Product(4,"Mobile",25000f));
		productList.add(new Product(5,"Cooler",25000f));
		
		List<Float> productPriceList2=productList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println("The highest price of Products are "+ productPriceList2);
	}
}