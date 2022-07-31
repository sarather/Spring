package com.ritik.spring.springcoreAdvance.standalonecollections;

import java.util.List;

public class ProductList {
	@Override
	public String toString() {
		return "ProductList [productNames=" + productNames + "]";
	}

	private List<String> productNames;

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}
}
