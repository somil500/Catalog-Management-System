package com.E_Commerce.Catalogue.Controller;

import com.E_Commerce.Catalogue.comerce.Categery;
import com.E_Commerce.Catalogue.comerce.Category_service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public class Catetory_controller
{
    private final  Category_service service;

    public Catetory_controller(Category_service service) {
        this.service = service;
    }

    @GetMapping
    public List<Categery>getall_categories(){
        return  service.Get_categories();
    }
}
