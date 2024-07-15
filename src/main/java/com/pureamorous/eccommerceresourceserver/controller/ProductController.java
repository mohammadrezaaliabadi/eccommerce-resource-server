package com.pureamorous.eccommerceresourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/shop")
public class ProductController {

    @GetMapping("/categories")
    public List<String> getCategories(){
        String[] categories = new String[]{"Shoes","Jackets","Suits"};
        return Arrays.asList(categories);
    }

    @GetMapping("/products")
    public List<String> getProducts(){
        String[] categories = new String[] {"Shoe-01","Jacket-01","Suit-01"};
        return Arrays.asList(categories);
    }

}
