package com.E_Commerce.Catalogue.comerce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Category_Repositry extends JpaRepository<Categery,Long>
{

}
