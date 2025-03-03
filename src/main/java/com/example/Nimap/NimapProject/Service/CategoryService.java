package com.example.Nimap.NimapProject.Service;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.example.Nimap.NimapProject.Dao.CategoryInterface;
import com.example.Nimap.NimapProject.Dao.ProductInterface;
import com.example.Nimap.NimapProject.Entity.Category;
import com.example.Nimap.NimapProject.Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;


import jakarta.persistence.EntityNotFoundException;

@Component
public class CategoryService {

		@Autowired
		private CategoryInterface ci;
		private ProductInterface pi;
	
		
		public CategoryService(CategoryInterface ci) {
	        this.ci = ci;
	    }

	   

		   
		

		
		//-----Get All  Information of Categories------------//
		public List<Category>getAll(){
			
		List<Category>Li1=(List<Category>)this.ci.findAll();
		return Li1;
			
		}
		
		//-----GetCategory By Id-------------------------//
		
		
		public Category getCategoryById(Long C_id) {
			
			return this.ci.findById(C_id).orElseThrow(() -> new EntityNotFoundException("Category not found with id: " + C_id));
		}
		
		
		//------Add Category------------------//
		
		public Category addCategory(Category c) {
			
			
				return this.ci.save(c);
		}
		
		//----Update Category--------------//
		
		public Category updateCategory(Category c,Long c_id) {
			
					c.setC_id(c_id);
					return this.ci.save(c);
		}
		
		//-----Delete Category By Id-------------//
		
		public void deleteCategory(Long c_id) {
			
					
			this.ci.deleteById(c_id);
			System.out.println("Category Is Deleted");
		}
		
		
		//---------Extra METHIOD---------------------//
		
		
		//public List<Product>getProductByCategoryId(Long c_id){
			
			
		//	List<Product>Pi1=(List<Product>) this.pi.findById(c_id);
			
		//	return Pi1;	
	//	}
		
}
