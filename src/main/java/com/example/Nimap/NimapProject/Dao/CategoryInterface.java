package com.example.Nimap.NimapProject.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.example.Nimap.NimapProject.Entity.Category;
import com.example.Nimap.NimapProject.Entity.Product;

public interface CategoryInterface extends CrudRepository<Category,Long>,JpaRepository<Category,Long>{

		
}
