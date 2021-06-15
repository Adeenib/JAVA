package com.firsttry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
@Controller
@RequestMapping("/hello")
public class FirsttryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirsttryApplication.class, args);
	}
	@RequestMapping("/")
	   public String hello(Model model) { 
		model.addAttribute("dojoName", "Burbank");
        return "index.jsp";
	}
	 @RequestMapping("/world")
     public String world() {
             return "Class level annotations are cool too!";
     }
	  @RequestMapping("/m/{track}/{module}/{lesson}")
	    public String showLesson(@PathVariable("track") Integer track, @PathVariable Integer module, @PathVariable("lesson") String lesson){
	    	return "Track: " + (track  + module) + ", Lesson: " + lesson;
	    }
}
