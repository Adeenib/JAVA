package com.axsos.languages.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.languages.models.LangModels;
import com.axsos.languages.services.LangService;

@Controller
public class langController {
	private final LangService langservice;

	public langController(LangService langservice) {

		this.langservice = langservice;
	}

	@RequestMapping("/languages")
	public String home(Model model, @ModelAttribute("lang") LangModels lang) {
		List<LangModels> languages = langservice.allLang();

		model.addAttribute("languages", languages);
		return "home.jsp";

	}

	@RequestMapping(value = "/languages/create", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("lang") LangModels lang, BindingResult result) {
		if (result.hasErrors()) {
			return "home.jsp";
		} else {

			langservice.createLang(lang);

			return "redirect:/languages";
		}
	}

	@RequestMapping(value = "/languages/{id}", method = RequestMethod.GET)
	public String show(@PathVariable("id") Long id, Model model) {
		LangModels lang = langservice.langInfo(id);
		model.addAttribute("lang", lang);
		return "show.jsp";

	}

	@RequestMapping(value = "/languages/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") Long id) {
		langservice.deleteLang(id);
		return "redirect:/languages";
	}

	@RequestMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		LangModels langInformation = langservice.langInfo(id);
		model.addAttribute("lang", langInformation);
		return "edit.jsp";

	}

	@RequestMapping(value = "/languages/editlang/{id}", method = RequestMethod.PUT)
	public String putInformation( @PathVariable("id") Long id,@Valid @ModelAttribute("lang") LangModels lang,BindingResult result) {
		System.out.println("hay");
		if(result.hasErrors()) {
			return "edit.jsp";

		}else {
		langservice.updateLang(lang,id);
		}
		return "redirect:/languages/{id}?";
	}

}
