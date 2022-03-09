package com.rajesh.hashmapcrud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class ProductCRUD {
	// HashMap of Product Objects
	HashMap<String, Product> listOfProducts = new HashMap<String, Product>();
	Product product;
	int noOfProducts;
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	Collection<Product> prodObjects = null;
	public void menu() {

		try {
			while (ch == 'y') {

				System.out.println("Enter the choice .....");
				System.out.println("add : to add product");
				System.out.println("update:to update product");
				System.out.println("delete:to delete product");
				System.out.println("display: to display all product");
				System.out.println("search: to search for a product");
				System.out.println("sortbyname: to sort the product list by name");
				System.out.println("sortbypriceasc: to sort the product list by price low to high");
				System.out.println("sortbypricedesc: to sort the product list by price high to low");
				sc.nextLine();
				String choice = sc.nextLine();
				switch (choice) {
				case "add":
					addProduct();
					break;
				case "update":
					updateProductByName();
					break;
				case "delete":
					// deleteStudent();
					deleteProductUsingName();
					break;
				case "display":
					displayProduct();
					break;
				case "search":
					searchProductByName();
					break;
				case "sortbyname":
					sortProductByName();
					break;
				case "sortbypriceasc":
					sortProductByPriceAsc();
					break;
				case "sortbypricedesc":
					sortProductByPriceDesc();
					break;
				default:
					System.out.println("Not a proper choice");
					break;
				}

				System.out.println("do you want to continue....");
				System.out.println("Enter 'y' to continue ......");
				ch = sc.next().charAt(0);

			} // while close
		} // try close
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void deleteProductUsingName() throws ProductNotFoundException {
		Product product =  searchProductByName();
		
		String productkey = findProductKey(product);
		
		if(product == null) {
			throw new ProductNotFoundException("Product not found....");
		}else {
			
			listOfProducts.remove(productkey,product);
			
		}
		
	}

	Entry<String,Product> productEntry = null;
	Set<Entry<String, Product>> productEntrySets = null;
	private String findProductKey(Product product) throws ProductNotFoundException {
		String foundkey = null;
		if(product == null) {
			throw new ProductNotFoundException("Product not found....");
		}else {
			productEntrySets = listOfProducts.entrySet();
		Iterator<Entry<String, Product>> productItr = productEntrySets.iterator();
		while(productItr.hasNext()) {
			productEntry = productItr.next();
			if(productEntry.getValue().equals(product)) {
				foundkey =  productEntry.getKey();
			}
		}
		}
		System.out.println(productEntrySets);
		return foundkey;
	}

	Product foundProduct = null;
	private  Product searchProductByName(){
		System.out.println("Enter the name of the product to search");
		String searchPName = sc.nextLine();
		prodObjects = listOfProducts.values();
		Iterator<Product> productItr = prodObjects.iterator();
		while(productItr.hasNext()) {
			foundProduct = productItr.next();
			if(foundProduct.getProductName().equals(searchPName)) {
				System.out.println("Product FOund...");
				break;
			}
		}
		System.out.println("Product Details are.....");
		System.out.println("Product Id = " + foundProduct.getProductId());
		System.out.println("Product Id = " + foundProduct.getProductName());
		System.out.println("Product Id = " + foundProduct.getProductPrice());
		System.out.println("Product Id = " + foundProduct.getProductCategory());
		return foundProduct;
	}

	private void updateProductByName() throws ProductNotFoundException {
	
		Product product =  searchProductByName();
		
		if(product == null) {
			throw new ProductNotFoundException("Product not found....");
		}else {
			System.out.println("Enter the details to update (if necessary else enter the previous values");
			readProductDetails();
		}
		
	}

	private void sortProductByPriceDesc() {
		System.out.println("Before Sorted List .........");
		displayProduct();
		prodObjects = listOfProducts.values();
		ArrayList<Product> prodList = new ArrayList<Product>();
		prodList.addAll(prodObjects);
		Collections.sort(prodList, new PriceComparatorDesc());
		//Collections.sort(prodList, new PriceComparator().reversed());
		System.out.println("Sorted List .........");
		System.out.println("Product Id" + "\t" + "Product Name " + "\t" + "Product Price " +"\t" +"Product Category");
		for(Product product : prodList) {
			System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getProductPrice() +"\t" +product.getProductCategory());

		}
		
	}

	private void sortProductByPriceAsc() {
		System.out.println("Before Sorted List .........");
		displayProduct();
		prodObjects = listOfProducts.values();
		ArrayList<Product> prodList = new ArrayList<Product>();
		prodList.addAll(prodObjects);
		Collections.sort(prodList, new PriceComparator());
		System.out.println("Sorted List .........");
		System.out.println("Product Id" + "\t" + "Product Name " + "\t" + "Product Price " +"\t" +"Product Category");
		for(Product product : prodList) {
			System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getProductPrice() +"\t" +product.getProductCategory());

		}
		
	}

	/**
	 * to sort the products based on name using NameComparator
	 */
	private void sortProductByName() {
		System.out.println("Before Sorted List .........");
		displayProduct();
		prodObjects = listOfProducts.values();
		ArrayList<Product> prodList = new ArrayList<Product>();
		prodList.addAll(prodObjects);
		Collections.sort(prodList, new NameComparator());
		System.out.println("Sorted List .........");
		System.out.println("Product Id" + "\t" + "Product Name " + "\t" + "Product Price " +"\t" +"Product Category");
		for(Product product : prodList) {
			System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getProductPrice() +"\t" +product.getProductCategory());

		}
	}
	/**
	 * display product objects which are stored in the HashMap
	 */
	private void displayProduct() {
		
		prodObjects = listOfProducts.values();
		System.out.println(prodObjects);
		System.out.println("List of All Products..........");
		System.out.println("Product Id" + "\t" + "Product Name " + "\t" + "Product Price " +"\t" +"Product Category");
		for(Product product : prodObjects) {
			System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getProductPrice() +"\t" +product.getProductCategory());

		}
		
	}

	/**
	 * create product objects and stores in the HashMap
	 */
	private void addProduct() {
		System.out.println("Enter the number of products to store in HashMap........");
		noOfProducts = sc.nextInt();
		System.out.println("Enter the Product details");
		// creating and adding Product objects in the above HashMap
		for (int i = 0; i < noOfProducts; i++) {
			product = new Product();
			readProductDetails();
			System.out.println(product);
			System.out.println("Enter the Barcode of the Product......");
			String barcode = sc.next();
			listOfProducts.put(barcode, product);
			System.out.println(listOfProducts);
		}
	}

	/**
	 * Setting product details using setters of the Product
	 */
	private void readProductDetails() {
		try {
			System.out.println("Enter the Product data......");
			System.out.println("Enter the Product Id.....");
			product.setProductId(sc.nextInt());
			System.out.println("Enter the Product Name.....");
			sc.nextLine();// throw away the newline read by scanner
			product.setProductName(sc.nextLine());
			System.out.println("Enter the Product Price......");
			product.setProductPrice(sc.nextFloat());
			if (validate(product.getProductPrice())) {
				System.out.println("Thank you for providing correct price.....");
			} else {
				System.out.println("Enter valid price");
			}
			System.out.println("Enter the Product Category....");
			sc.nextLine();// throw away the newline read by scanner
			product.setProductCategory(sc.nextLine());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param pPrice
	 * @return boolean
	 * @throws PriceNotValidException 
	 */
	private boolean validate(float pPrice) throws PriceNotValidException {
		if (pPrice <= 0) {
			throw new PriceNotValidException("Price cannot be less than or equal to zero");
		} else {
			
			return true;
		}
	}
}