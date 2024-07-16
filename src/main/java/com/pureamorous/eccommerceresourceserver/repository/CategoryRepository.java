package com.pureamorous.eccommerceresourceserver.repository;

import com.pureamorous.eccommerceresourceserver.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
