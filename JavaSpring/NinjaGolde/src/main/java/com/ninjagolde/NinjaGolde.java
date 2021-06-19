package com.ninjagolde;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class NinjaGolde {
	ArrayList<String> activte=new ArrayList<String>();
	@RequestMapping("")
	public String ninja(HttpSession s,Model m) {
		if(s.getAttribute("result")==null ) {
			s.setAttribute("result",0);
			
			
		}
		if( s.getAttribute("type")==null) {
			s.setAttribute("type","");
		}
			
			
		
			
		
		return "home.jsp";
		
	}
	@RequestMapping("/process_money")
	public String processMoney(@RequestParam(value="action")String action,HttpSession s) {
		Random r=new Random();
		Date date = new Date();
		SimpleDateFormat date1 = new SimpleDateFormat("EEEE, MMMM dd YYYY hh:mm:ss a");
		String date2 = date1.format(date);
		
		
		int result=(int)s.getAttribute("result");
		int golde=0;
		if (action.equals("farm")) {
			
			golde=r.nextInt(10)+10;
			result+=golde;
			String a = "You entere  a farm and earned " + Integer.toString(golde) +" at " + date2;
			activte.add(a);
			
		}
		else if (action.equals("Cave")) {
		
			golde=r.nextInt(5)+5;
			result+=golde;
			String a = "You entere  a Cave and earned " + Integer.toString(golde) +" at " + date2;
			activte.add(a);
		}
		else if (action.equals("House")) {
	
			golde=r.nextInt(5-2)+2;
			result+=golde;
			String a = "You entere  a house and earned " + Integer.toString(golde) +" at " + date2;
			activte.add(a);
		}
		else if (action.equals("Casino")) {
			
			golde=r.nextInt(100)-50;
			result+=golde;
			if(golde >= 0) {
				
				String a = "You entere  a casino and earned " + Integer.toString(golde) +" at " + date2;
				activte.add(a);
			}
			else{
				String a = "You entere  a casino and lost " + Integer.toString(golde)  +" at " + date2;
				activte.add(a);
			}
		}
		s.setAttribute("activte",activte);
		s.setAttribute("result",result);
		System.out.println(activte);
		return "redirect:/";
	
	}
	
}
