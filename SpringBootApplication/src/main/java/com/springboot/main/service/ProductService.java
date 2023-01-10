package com.springboot.main.service;

import org.springframework.stereotype.Service;

import com.springboot.main.entity.Product;
import com.springboot.main.request.ProductRequest;

@Service
public interface ProductService {

	Product saveProduct(ProductRequest productRequest);

}
