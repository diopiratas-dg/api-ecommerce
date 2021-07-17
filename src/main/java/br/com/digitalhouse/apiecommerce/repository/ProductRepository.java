package br.com.digitalhouse.apiecommerce.repository;

import br.com.digitalhouse.apiecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>  {
}
