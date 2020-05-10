package mx.escapeSchool.market.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping(path = "/product")
	public String getProduct() {
		return "GET from /product";
	}
	
}
