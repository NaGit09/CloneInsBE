package org.example.cloneins.Repository;

import org.example.cloneins.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Long > {
}
