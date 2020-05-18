package mx.escapeSchool.market.service.interfaces;

import mx.escapeSchool.market.domain.Product;
import mx.escapeSchool.market.dtos.ProductDto;

public interface IProduct {
	
	public Product get(Long id);
	public Product create(ProductDto dto);
	public Product update(ProductDto dto);
	public void delete(Long id);


}
