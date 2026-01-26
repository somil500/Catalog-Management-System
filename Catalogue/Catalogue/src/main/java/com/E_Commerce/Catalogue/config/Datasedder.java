package com.E_Commerce.Catalogue.config;

import com.E_Commerce.Catalogue.comerce.Categery;
import com.E_Commerce.Catalogue.comerce.Category_Repositry;
import com.E_Commerce.Catalogue.comerce.Product;
import com.E_Commerce.Catalogue.comerce.Product_Repositry;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Datasedder implements CommandLineRunner {

    private final Category_Repositry categoryRepositry;
    private final Product_Repositry productRepositry;

    // Single constructor for dependency injection
    public Datasedder(Category_Repositry categoryRepositry, Product_Repositry productRepositry) {
        this.categoryRepositry = categoryRepositry;
        this.productRepositry = productRepositry;
    }

    @Override
    public void run(String... args) throws Exception {
        // Delete all old data
        productRepositry.deleteAll();// delete chiled first

        categoryRepositry.deleteAll();// then parent


        // Create categories
        Categery e = new Categery();
        e.setName("Electronics");
        Categery c = new Categery();
        c.setName("Clothes");
        Categery studay = new Categery();
        studay.setName("Studay");

        categoryRepositry.saveAll(Arrays.asList(e, c, studay));

        // Products - Electronics
        Product phone = new Product();
        phone.setName("Iphone");
        phone.setDiscription("SmartPhone");
        phone.setImage_url("https://placehold.co/600x400");
        phone.setPrice(50000.00);
        phone.setCategery(e);

        Product laptop = new Product();
        laptop.setName("HP");
        laptop.setDiscription("High performance");
        laptop.setImage_url("https://placehold.co/600x400");
        laptop.setPrice(70000.00);
        laptop.setCategery(e);

        Product Hadphone = new Product();
        Hadphone.setName("HP");
        Hadphone.setDiscription("High performance");
        Hadphone.setImage_url("https://placehold.co/600x400");
        Hadphone.setPrice(700.00);
        Hadphone.setCategery(e);



        // Products - Clothes
        Product shoes = new Product();
        shoes.setName("Nike");
        shoes.setDiscription("Touch-shoes");
        shoes.setImage_url("https://placehold.co/600x400");
        shoes.setPrice(500.00);
        shoes.setCategery(c);

        Product jacket = new Product();
        jacket.setName("paras");
        jacket.setDiscription("Winter-jacket");
        jacket.setImage_url("https://placehold.co/600x400");
        jacket.setPrice(500.00);
        jacket.setCategery(c);

        // Products - Studay
        Product pen = new Product();
        pen.setName("Comboc");
        pen.setDiscription("Hand-writing");
        pen.setImage_url("https://placehold.co/600x400");
        pen.setPrice(5.00);
        pen.setCategery(studay);

        Product notebook = new Product();
        notebook.setName("Jomboc");
        notebook.setDiscription("spiral-Notebook");
        notebook.setImage_url("https://placehold.co/600x400");
        notebook.setPrice(50.00);
        notebook.setCategery(studay);

        // Save all products
        productRepositry.saveAll(Arrays.asList(phone, laptop, Hadphone,shoes, jacket, pen, notebook));
    }
}
