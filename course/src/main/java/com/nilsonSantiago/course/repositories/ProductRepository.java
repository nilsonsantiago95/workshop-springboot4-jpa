package com.nilsonSantiago.course.repositories;

import com.nilsonSantiago.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
