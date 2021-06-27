package com.categoryproduct.repositores;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.categoryproduct.models.CategoryProduct;
@Repository
public interface CategoryProductRepository  extends CrudRepository<CategoryProduct, Long>{

}
