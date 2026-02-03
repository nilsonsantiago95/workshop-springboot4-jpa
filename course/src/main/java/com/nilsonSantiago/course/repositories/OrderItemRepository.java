package com.nilsonSantiago.course.repositories;

import com.nilsonSantiago.course.entities.OrderItem;
import com.nilsonSantiago.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
