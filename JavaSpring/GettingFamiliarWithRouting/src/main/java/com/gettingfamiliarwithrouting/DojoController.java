package com.gettingfamiliarwithrouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class DojoController {
	@RequestMapping("/{dojo}")
	public String dojo(@PathVariable("dojo")String track) {
		return "The " + track + " is awesome";
				
	}
	@RequestMapping("/{text}//")
	public String burbank(@PathVariable("text")String track) {
		if (track.equals("burbank-dojo"))
			return "Burbank Dojo is located in Southern California";
		else if(track.equals("san-jose"))
			return "SJ dojo is the headquarters";
		else {
			return "eiwwwwwwwwww";
		}
		
	}
}
