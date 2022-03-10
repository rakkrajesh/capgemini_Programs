package com.rajesh.java8functions.lamdafun;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;



public class ProductPriceSort {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		HashMap<String, Product> listOfProducts = new HashMap<String, Product>();
		listOfProducts.put("SR1234", new Product(123, "Pen", 45, "St"));
		listOfProducts.put("SR1235", new Product(124, "Pencil", 25, "St"));
		listOfProducts.put("SR1236", new Product(125, "HeroPen", 145, "St"));
		listOfProducts.put("SR1237", new Product(126, "PilotPen", 85, "St"));
		listOfProducts.put("SR1238", new Product(127, "ReylondsPen", 15, "St"));
		
		
		
		
		Collection<Product>  productList =listOfProducts.values();
		List<Product> al = new ArrayList<Product>();
		al.addAll(productList);
		Collections.sort((List) al);
		
		System.out.println(al);
		
	}
	
	

}
