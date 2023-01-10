package com.springboot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.request.ProductRequest;
import com.springboot.main.response.ResponseObject;
import com.springboot.main.service.ProductService;

@RestController
@RequestMapping("/api/product/")
public class ProductController extends BaseController {

	@Autowired
	public ProductService productService;

	@PostMapping("save")
	public ResponseObject saveProductInfo(@RequestBody ProductRequest productRequest) {

		ResponseObject responseObject = null;

		try {
			responseObject = getResponse(productService.saveProduct(productRequest));
		} catch (Exception e) {

			responseObject = new ResponseObject(null, e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return responseObject;
	}
}
