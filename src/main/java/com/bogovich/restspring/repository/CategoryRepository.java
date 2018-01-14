package com.bogovich.restspring.repository;

import com.bogovich.restspring.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
