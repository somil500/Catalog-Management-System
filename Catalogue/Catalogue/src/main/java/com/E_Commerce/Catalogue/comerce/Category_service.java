package com.E_Commerce.Catalogue.comerce;

import org.springframework.stereotype.Service;

import java.util.List;

//import java.util.List;
@Service
public class Category_service
{
    private Category_Repositry repositry;

    public Category_service(Category_Repositry repositry)
    {
        this.repositry = repositry;
    }

    public List<Categery> Get_categories()
    {
        return  repositry.findAll();

    }
}
