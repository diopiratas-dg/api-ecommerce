package br.com.digitalhouse.apiecommerce.repository;

import br.com.digitalhouse.apiecommerce.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer> {
}
