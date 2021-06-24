package com.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.driverslicense.models.License;
import com.driverslicense.models.Person;
import com.driverslicense.services.LicenseService;
import com.driverslicense.services.PersonService;


@Controller
public class DriversLicenseController {
	private PersonService personservice;
	private LicenseService licenseservice;

	public DriversLicenseController (PersonService personservice,LicenseService licenseservice) {
		this.personservice = personservice;
		this.licenseservice= licenseservice;
	}
	 @RequestMapping("/person/new")
	 public String CreatPerson(@ModelAttribute("person") Person person) {
		 
		 return "index.jsp";
		 
	 }
	 @PostMapping("/creatperson")
	 public String creat(@Valid @ModelAttribute("person") Person person,BindingResult result) {
		 personservice.creatNewPearson(person);
		 return "redirect:/license/new";
	 }
	 
	 @RequestMapping("/license/new")
	 public String creatLicense(@ModelAttribute("license") License license,Model model) {
		 List<Person> allPersons= personservice.findAllPersons();
		 model.addAttribute("persons",allPersons);
		 return "creatLicense.jsp";
		 
	 }
	 @PostMapping("/creatlicense")
	 public String creatli(@ModelAttribute("license") License license) {
		 Integer num = licenseservice.lastNumber();
		 license.setNumber(num);
		 licenseservice.CreatLicense(license);
		 return "redirect:/person/"+license.getPerson().getId();
	 }
	 
	 @RequestMapping("/person/{id}")
	 public String show(@PathVariable("id")Long id,Model model) {
		 model.addAttribute("info",personservice.gitById(id));
		 return"show.jsp";
	 }

}
