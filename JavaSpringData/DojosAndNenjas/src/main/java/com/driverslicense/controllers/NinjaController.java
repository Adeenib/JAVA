package com.driverslicense.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.driverslicense.models.Ninja;
import com.driverslicense.services.DojoService;
import com.driverslicense.services.NinjaService;

@Controller
public class NinjaController {
	public DojoService dojoService;
	public NinjaService ninjaService;


	public NinjaController(DojoService dojoService, NinjaService ninjaService) {
		super();
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}

	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja")Ninja ninja,Model model) {
		model.addAttribute("Dojos",dojoService.allDojos());
		return"/Ninjas/index.jsp";
		
	}
	@PostMapping("/ninjas")
	public String creatNinja(@ModelAttribute("ninja")Ninja ninja) {
		ninjaService.creatNinja(ninja);
		return"redirct:/dojos/"+ninja.getDojo().getId();
	}
}
