package com.categoryproduct.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.categoryproduct.models.Category;
import com.categoryproduct.models.CategoryProduct;
import com.categoryproduct.models.Product;
import com.categoryproduct.repositores.CategoryProductRepository;
import com.categoryproduct.repositores.CategoryRepository;
import com.categoryproduct.repositores.ProductRepository;

@Service
public class AppService {
	private final CategoryRepository categRepo;
	private final ProductRepository productRepo;
	private final CategoryProductRepository catProRepo;
	public AppService(CategoryRepository categRepo, ProductRepository productRepo,
			CategoryProductRepository catProRepo) {
		
		this.categRepo = categRepo;
		this.productRepo = productRepo;
		this.catProRepo = catProRepo;
	}
	public Product findctProduById(Long id) {
		return productRepo.findById(id).orElse(null);
		
	}
	public Category findCategroyById(Long id) {
		return categRepo.findById(id).orElse(null);
			
		
	}
	public List<Product> unAddedProducts(Category c) {
		return productRepo.findByCategoriesNotContains(c);
	}
	
	public List<Category>unAddCategory(Product p) {
		return categRepo.findByProductsNotContains(p);
		
	}
	public Product addProduct(Product p) {
		return productRepo.save(p);
		
	}
	public  Category addCategory(Category c) {
		return categRepo.save(c);
		
	}
	public CategoryProduct add(CategoryProduct cp) {
		return catProRepo.save(cp);
		
	}

}

