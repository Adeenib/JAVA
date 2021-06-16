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

	private String name;
	private String location;
	private String language;
	private String comment;

	@RequestMapping("")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String result(@RequestParam(value = "name") String name, @RequestParam(value = "location") String location,
			@RequestParam(value = "language") String language, @RequestParam(value = "comment") String comment) {

		setName(name);
		setLanguage(language);
		setLocation(location);
		setComment(comment);
		
		return "redirect:/dashboard";
	}

	@RequestMapping("/dashboard")
	public String redirection(Model m) {
		m.addAttribute("user",this);
		
		return "result.jsp";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	

}
