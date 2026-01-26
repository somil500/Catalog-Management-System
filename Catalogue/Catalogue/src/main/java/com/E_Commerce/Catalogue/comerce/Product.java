package com.E_Commerce.Catalogue.comerce;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product
{    @Id // for primary key
     @GeneratedValue(strategy = GenerationType.IDENTITY)// for auto incriment id
    private  Long id;
    private String name;
    private  String discription;
    private  String image_url;
    private double price;


    @ManyToOne
    @JoinColumn(name = "categery_id" ,nullable= true)
    @JsonIgnoreProperties("products")
    private  Categery categery;


}
