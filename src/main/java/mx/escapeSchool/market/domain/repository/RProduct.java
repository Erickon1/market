package mx.escapeSchool.market.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.escapeSchool.market.domain.Product;

@Repository
public interface RProduct extends CrudRepository<Product, Long> {

}
