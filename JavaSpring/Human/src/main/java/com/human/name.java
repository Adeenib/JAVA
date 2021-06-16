package com.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/your_server")
public class name {
	@RequestMapping("")
	public String noname() {
		return "<h1>Hello human</h1> <p>welcome to spring boot</p>";
	}
	@RequestMapping("/")
	 public String name1(@RequestParam(value="name", required=false) String name,@RequestParam(value="name1", required=false) String name1) {
		if (name==null)
			return "<h1>Hello human</h1> <p>welcome to spring boot</p>";
		else
			return "<h1>Hello "+name+"   "+name1+"</h1> <p>welcome to spring boot</p>";
	}

}
