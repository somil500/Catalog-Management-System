package com.E_Commerce.Catalogue.comerce;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Categery
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @JsonIgnore
@OneToMany(mappedBy = "categery", cascade = CascadeType.ALL ,
fetch = FetchType.LAZY)
Set<Product>products;

}
