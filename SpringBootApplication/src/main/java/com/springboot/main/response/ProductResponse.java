package com.springboot.main.response;

public class ProductResponse {

	private String productName;
	private String description;
	private double price;

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
		return "ProductResponse [productName=" + productName + ", description=" + description + ", price=" + price
				+ "]";
	}

}
