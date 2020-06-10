package mx.escapeSchool.market.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.escapeSchool.market.domain.TypeProduct;

@Repository
public interface RTypeProduct extends 
	CrudRepository<TypeProduct, Integer>{

}
