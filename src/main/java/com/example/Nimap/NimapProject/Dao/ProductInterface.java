package com.example.Nimap.NimapProject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.example.Nimap.NimapProject.Entity.Category;
import com.example.Nimap.NimapProject.Entity.Product;

public interface ProductInterface extends CrudRepository<Product,Long>, JpaRepository<Product,Long>{

}
