package com.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class homePage {
	@RequestMapping("")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
	        redirectAttributes.addFlashAttribute("error", "You must train hard!");
	        return "redirect:/";
	    }
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String codePage(@RequestParam(value="password")String thecode) {
		if(thecode.equals("bushido")) {
			return "secrat.jsp";
		}
		
		return "redirect:/createError";
			
		
		
	}
}