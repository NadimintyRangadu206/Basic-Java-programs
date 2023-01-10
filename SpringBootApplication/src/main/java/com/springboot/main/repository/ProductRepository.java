package com.springboot.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.main.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

	Optional<Product> findByProductId(long productId);

}
