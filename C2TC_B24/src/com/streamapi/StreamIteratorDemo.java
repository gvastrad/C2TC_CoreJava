package com.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamIteratorDemo {

	public static void main(String[] args) {
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(1,"Television",25000f));
		productList.add(new Product(2,"Fridge",35000f));
		productList.add(new Product(3,"Washing Machine",45000f));
		productList.add(new Product(4,"Mobile",25000f));
		productList.add(new Product(5,"Cooler",25000f));
		
		productList.stream().filter(product->product.price==25000).forEach(product->System.out.println(product.name));

	}

}
