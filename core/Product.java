package core;

import java.io.Serializable;
import java.time.LocalDate;

import custom_exception.ProductHandlingException;

public class Product implements Comparable,Serializable{
	
	private int productId;
	private String name;
	private String desc;
	private int quantity;
	private double price;
	private category productCategory;
	private LocalDate expiryDate;
	
	public Product(int productId, String name, String desc, int quantity, double price, category productCategory,LocalDate expiryDate) {
		super();
		this.productId = productId;
		this.name = name;
		this.desc = desc;
		this.quantity = quantity;
		this.price = price;
		this.productCategory = productCategory;
		this.expiryDate=expiryDate;
	}
	
	public Product(int productId) {
		this.productId=productId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(category productCategory) {
		this.productCategory = productCategory;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", desc=" + desc + ", quantity=" + quantity
				+ ", price=" + price + ", productCategory=" + productCategory + ", expiryDate=" + expiryDate + "]";
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return ((Integer)productId).hashCode();
	}

	@Override
	public boolean equals(Object obj){
		// TODO Auto-generated method stub
		System.out.println("in eq..");
		if(obj instanceof Product)
			return Integer.valueOf(this.getProductId()).equals(((Product)obj).getProductId());
		
		return false;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(productId).compareTo(((Product)o).productId);
	}
	
	
	
}
