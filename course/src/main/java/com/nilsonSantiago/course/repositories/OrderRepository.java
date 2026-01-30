package com.nilsonSantiago.course.repositories;

import com.nilsonSantiago.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
