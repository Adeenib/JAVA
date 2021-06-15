package com.strings;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StringsApplication.class);
		
	}
	@RequestMapping("/")
	public String hello() {
		return "Hello clint how are you?";
	}
	@RequestMapping("/random")
	public String random() {
		return "nice to viset us";
	}

}
