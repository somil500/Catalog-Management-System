package com.E_Commerce.Catalogue.comerce;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class Product_service
{
    private  Product_Repositry productRepositry;

    public Product_service(Product_Repositry productRepositry) {
        this.productRepositry = productRepositry;
    }

    public List<Product> Get_product() {
        return  productRepositry.findAll();
    }

    public List<Product> Get_product_By_categroy(Long Category_id) {
        return productRepositry.findByCategery_Id(Category_id);
    }
}
