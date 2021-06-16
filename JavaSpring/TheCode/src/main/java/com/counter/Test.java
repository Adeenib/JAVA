package com.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	
	public  int counter=0;
	

	
	
	@RequestMapping("")
	public String home() {
		this.counter++;
		
       
		return "home.jsp";
	}
	@RequestMapping("/counter")
	public String counterBage(HttpSession session) {
		
		session.setAttribute("count", counter);
		return "counterbage.jsp";
	}

}
