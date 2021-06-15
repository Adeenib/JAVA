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
	 public String name1(@RequestParam(value="name", required=false) String name) {
        return "<h1>Hello"+name+"</h1> <p>welcome to spring boot</p>";
	}

}
