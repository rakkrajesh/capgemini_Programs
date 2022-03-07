package com.collections.productarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductCRUDUsingArrayList 
{
	ArrayList<Product> proList = new ArrayList<Product>();
	Product product;
	int productCount;
	Scanner sc1 = new Scanner(System.in);
	
	char choice = 'y';
	
	public void options() {
		
		try {
			while (choice == 'y') {
				
				System.out.println("hello there! please choose a option from below.. ");
				System.out.println("add : to add product in the array ");
				System.out.println("update : to update the product in the array ");
				System.out.println("delete : to delete the product from the array ");
				System.out.println("display : to delete the product from the array ");
				System.out.println("search : to search for a specific product from array");
				System.out.println("sort : to sort the productList");
				String methodChoice = sc1.next();
				switch (methodChoice) {
				case "add":
					addProduct();
					break;
				case "update":
					updateProduct();
					break;
				case "display":
					displayProduct();
					break;
				case "delete":
					deleteProduct();
//					deleteProductUsingSearch();
					break;
				case "search":
					searchProduct();
					break;
				case "sort":
					sortProduct();
					break;
				default:
					System.out.println("Enter a proper Method Choice given Above");
					break;
				}//switch
				System.out.println("Would You Like To Continue...");
				System.out.println("Enter 'y' to Continue...");
				choice = sc1.next().charAt(0);
			}//while
//			System.out.println("=========================");
		}//try
	catch(Exception excep){
		excep.printStackTrace();
	}
}//option

	private void sortProduct() {
//		 TODO Auto-generated method stub
	Collections.sort(proList);
	displayProduct();
	}

	private Product searchProduct() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Product details to search...");
		System.out.println("Enter the Product id to search...");
		String sId = sc1.next();
		for (int i = 0; i < proList.size(); i++) {
			if(proList.get(i).getProductId().equals(sId)) {
				product = proList.get(i);
				System.out.println(proList.get(i).getProductId() + "\t\t" +proList.get(i).getProductName() + "\t\t" +proList.get(i).getProductPrice() );
			}
		}
		return product;
	}
	
	private void deleteProduct() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Product details to delete");
		System.out.println("Enter the Product id to delete");
		String sId = sc1.next();
	
		for (int i = 0; i < proList.size(); i++) {
			if(proList.get(i).getProductId().equals(sId)) {
				Product s = proList.get(i);
				System.out.println(s);
				if(proList.remove(s)) {
					System.out.println("Product removed successfully");
				}else {
					System.out.println("Product Not removed");
				}
				
			}
		}
		
	}
	
	private void deleteProductUsingSearch() {
		
		product = searchProduct();
		 if(proList.remove(product)) {
			System.out.println("Product was successfully removed from the list");
		}else {
			System.out.println("oops! there seems to be problem with deletion");
		}

	}

	private void displayProduct() {
		// TODO Auto-generated method stub
		System.out.println("Product details to display.....");
		// display the Product data
		System.out.println("Product Id" + "\t" + "Product Name" + "\t" + "Product Price");
		for (int i = 0; i < proList.size(); i++) {	
			System.out.println(proList.get(i).getProductId() + "\t" +proList.get(i).getProductName() +"\t" + proList.get(i).getProductPrice() );
		}
	}

	private void updateProduct() {
		// TODO Auto-generated method stub
		Product prd1 = searchProduct();
		if(prd1 != null) {
			System.out.println("Enter the details to Modify .......");
			prd1.readProductDetails();
		}
		
	}

	private void addProduct() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of Products");
		productCount = sc1.nextInt();
//		System.out.println("Enter the Product Details...");
		
		for (int i=0; i< productCount; i++) {
			product = new Product(null, null, 0.0f);
			product.readProductDetails();
			System.out.println(product);
			proList.add(product);
			System.out.println(proList);
		}
	}
}
