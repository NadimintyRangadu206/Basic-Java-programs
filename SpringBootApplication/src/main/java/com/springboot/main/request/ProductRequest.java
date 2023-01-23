package com.springboot.main.request;

public class ProductRequest {

	private long productId;
	private String productName;
	private String description;
	private double price;

	
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductRequest [productId=" + productId + ", productName=" + productName + ", description="
				+ description + ", price=" + price + "]";
	}

}
