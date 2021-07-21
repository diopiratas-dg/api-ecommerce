package br.com.digitalhouse.apiecommerce.repository;

import br.com.digitalhouse.apiecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
