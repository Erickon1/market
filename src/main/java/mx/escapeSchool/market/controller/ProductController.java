package mx.escapeSchool.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.escapeSchool.market.domain.Product;
import mx.escapeSchool.market.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping(path = "/product")
	public Product getProduct() {
		return productService.get();
	}
	
}
