package mx.escapeSchool.market.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import mx.escapeSchool.market.domain.Product;
import mx.escapeSchool.market.service.interfaces.IProduct;

@Service
public class ProductService implements IProduct{

	@Override
	public Product get() {
		return new Product("Azucar", new BigDecimal(23.55));
	}
	
	

}
