package com.driverslicense.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.driverslicense.models.Dojo;
import com.driverslicense.services.DojoService;
import com.driverslicense.services.NinjaService;

@Controller
public class DojoController {
	public DojoService dojoService;
	public NinjaService ninjaService;


	public DojoController(DojoService dojoService, NinjaService ninjaService) {
		super();
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo")Dojo dojo) {
		return"/Dojos/index.jsp";
		
	}
	@PostMapping("/dojo")
	public String creatDojo(@ModelAttribute("dojo")Dojo dojo) {
		dojoService.creatDojo(dojo);
		
		return"redirect:/ninjas/new";
	}
	@RequestMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id")Long id,Model model) {
		model.addAttribute("dojos",dojoService.finedDojo(id));
		return "/Dojos/DojoShow.jsp";
	}
	

}
