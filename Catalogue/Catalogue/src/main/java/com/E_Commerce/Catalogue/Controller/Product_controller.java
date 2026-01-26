package com.E_Commerce.Catalogue.Controller;

import com.E_Commerce.Catalogue.comerce.Product;
import com.E_Commerce.Catalogue.comerce.Product_service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class Product_controller {

    private final Product_service productService;

    public Product_controller(Product_service productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.Get_product();
    }

    @GetMapping("/{category_id}")
    public List<Product> getByCategory(@PathVariable Long category_id) {
        return productService.Get_product_By_categroy(category_id);
    }
}
