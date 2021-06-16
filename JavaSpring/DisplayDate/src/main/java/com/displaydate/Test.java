package com.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
public class Test {
	@RequestMapping("")
	public String mainbage() {
		return "index1.jsp";
	}
	@RequestMapping("/date")
	public String date(Model m) {
		DateTime d=new DateTime();
		Date today = new Date();
	SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("EEEEEE,'the' dd 'of' MMM, yyyy");
		String day= DATE_FORMAT.format(today);
		
		m.addAttribute("day",day);
		return "index2.jsp";
		
	}
	@RequestMapping("/time")
	public String time(Model m) {
		
		Date t = new Date();
	SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("hh:mm aaa");
		String time= DATE_FORMAT.format(t);
		
		m.addAttribute("day",time);
		return "time.jsp";
		
	}
}
