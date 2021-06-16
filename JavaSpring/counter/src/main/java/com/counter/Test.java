package com.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	
	
	

	
	
	@RequestMapping("")
	public String home(HttpSession session) {
		if (session.getAttribute("count")==null) {
			session.setAttribute("count", 1);}
		else {addOne(session);}
       
		return "home.jsp";
	}
	@RequestMapping("/counter")
	public String counterBage(HttpSession session) {
		
		
		return "counterbage.jsp";
	}
	public void addOne(HttpSession session) {
		Integer c =(Integer)session.getAttribute("count");
		c++;
		session.setAttribute("count", c);
		
		
	}

}
