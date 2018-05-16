package com.ibrahim.product.bo;

import com.ibrahim.product.dto.Product;

public interface ProductBO {
	public void create(Product product);
	
	public Product findProduct(int id);
}
