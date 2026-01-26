package com.E_Commerce.Catalogue.comerce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Product_Repositry extends JpaRepository<Product,Long> {
    List<Product> findByCategery_Id(Long categeryid);
}
