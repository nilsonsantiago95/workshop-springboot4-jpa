package com.nilsonSantiago.course.repositories;

import com.nilsonSantiago.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
