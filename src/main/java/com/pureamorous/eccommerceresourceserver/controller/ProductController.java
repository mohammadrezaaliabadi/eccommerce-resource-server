package com.pureamorous.eccommerceresourceserver.controller;

import com.pureamorous.eccommerceresourceserver.model.Brand;
import com.pureamorous.eccommerceresourceserver.model.Category;
import com.pureamorous.eccommerceresourceserver.repository.BrandRepository;
import com.pureamorous.eccommerceresourceserver.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/shop")
public class ProductController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getCategories(){
        var categories = categoryRepository.findAll();
        if(categories.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(categories);
    }

    @GetMapping("/brands")
    public ResponseEntity<List<Brand>> getBrands() {
        List<Brand> brands = brandRepository.findAll();
        if(brands != null) {
            return ResponseEntity.ok(brands);
        }

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/products")
    public List<String> getProducts(){
        String[] categories = new String[] {"Shoe-01","Jacket-01","Suit-01"};
        return Arrays.asList(categories);
    }

}
