package com.categoryproduct.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.categoryproduct.Services.AppService;
import com.categoryproduct.models.Category;
import com.categoryproduct.models.CategoryProduct;
import com.categoryproduct.models.Product;

@Controller
public class ProCategController {
	private AppService appService;
	
	public ProCategController(AppService appService) {
		super();
		this.appService = appService;
	}
	@RequestMapping("/product/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "index.jsp";
		
	}
	@RequestMapping("/product")
	public String creartProduct(@Valid @ModelAttribute("product") Product product,BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		appService.addProduct(product);
		return "redirect:/product/"+product.getId();
	}
	@RequestMapping("/categories/new")
	public String newProduct(@ModelAttribute("category") Category category) {
		return "NewCategory.jsp";
		
	}
	@RequestMapping("/categories")
	public String creartCategory(@Valid @ModelAttribute("category") Category category,BindingResult result) {
		if(result.hasErrors()) {
			return "NewCategory.jsp";
		}
		appService.addCategory(category);
		return "redirect:/product/new";
	}
	
	@RequestMapping("/product/{id}")
	public String creatRelation(@PathVariable("id")Long id,Model model,@ModelAttribute("relation")CategoryProduct relation ) {
		Product theProduct =appService.findctProduById(id);
		List<Category> CategoriesNotContains = appService.unAddCategory(theProduct);
		model.addAttribute("CategoriesNotContains",CategoriesNotContains);
		model.addAttribute("theProduct",theProduct);
		return "showProduct.jsp";
		
	}
	@RequestMapping("/addCategory")
	public String addCategory(@Valid @ModelAttribute("relation")CategoryProduct relation ,BindingResult result  ) {
		if(result.hasErrors()) {
			return "showProduct.jsp";
		}
		appService.add(relation);
		return "redirect:/product/"+relation.getProduct().getId();
	}
	
	
}
