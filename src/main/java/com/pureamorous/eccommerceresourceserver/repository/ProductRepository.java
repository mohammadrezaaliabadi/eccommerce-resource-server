package com.pureamorous.eccommerceresourceserver.repository;

import com.pureamorous.eccommerceresourceserver.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
