package com.dojosurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class dojoSurvey {

	@RequestMapping("")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String result(RedirectAttributes info, @RequestParam(value = "name") String name,
			@RequestParam(value = "location") String location, @RequestParam(value = "language") String language,
			@RequestParam(value = "comment") String comment) {

		info.addAttribute("name", name);
		info.addAttribute("location", location);
		info.addAttribute("language", language);
		info.addAttribute("comment", comment);
		return "redirect:/dashboard";
	}

	@RequestMapping("/dashboard")
	public String redirection(Model m, @RequestParam(value = "name") String name,
			@RequestParam(value = "location") String location, @RequestParam(value = "language") String language,
			@RequestParam(value = "comment") String comment) {
		m.addAttribute("name", name);
		m.addAttribute("location", location);
		m.addAttribute("language", language);
		m.addAttribute("comment", comment);
		return "result.jsp";
	}
	
}
