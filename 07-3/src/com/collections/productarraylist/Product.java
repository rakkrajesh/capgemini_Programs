package com.collections.productarraylist;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Product implements Comparable<Product>
{
	private String productId;
	private String productName;
	private  float productPrice;
	public Product(String productId, String productName, float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public int hashCode() {
		return Objects.hash(productId, productName, productPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productId == other.productId && Objects.equals(productName, other.productName)
				&& Float.floatToIntBits(productPrice) == Float.floatToIntBits(other.productPrice);
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	Scanner sc1 = new Scanner(System.in);
	// to add details and access them
	
	public void readProductDetails() {
		try {
			System.out.println("Welcome to Equisite_Catalogue");
			System.out.println("Enter the product details");
			System.out.println("Enter the product_ID");
			productId = sc1.nextLine();
			System.out.println("Enter the product_Name");
			productName = sc1.nextLine();
			System.out.println("Enter the product_Price");
			productPrice = sc1.nextFloat();
			if ( productPrice < 0.0) 
				System.out.println("Product_price can't be a negative, please enter a postive price");	
			else 
				System.out.println("Thank you for providing the details");
		}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	
	public void displayProductDetails() {
		System.out.println("Thank you for Entering the Product_details......");
		System.out.println("Product Id = "+ productId);
		System.out.println("Product Name = "+ productName);
		System.out.println("product Price = "+ productPrice);
		System.out.println("=========================");
	}
	
	public int compareTo(Product st) {

		if(this.productName.compareTo(st.getProductName()) == 0)
			return 0;
		else
			if(this.productName.compareTo(st.getProductName()) > 0)
				return 1;
			else
				return -1;
	}

}

