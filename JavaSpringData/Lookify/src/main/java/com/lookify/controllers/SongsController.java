package com.lookify.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lookify.models.Songs;
import com.lookify.services.SongsService;

@Controller
public class SongsController {
	public final SongsService songserservice;

	public SongsController(SongsService songserservice) {
		this.songserservice = songserservice;
	}
	
	@RequestMapping("/")
	public String Welcome() {
		return "welcome.jsp";
	}
	@RequestMapping("/dashboard" )
	public String Dashboard(Model model, @ModelAttribute("song")Songs song) {
		model.addAttribute("songs",songserservice.allSongs());
		return "dashboard.jsp";
		
	}
	@RequestMapping("/search")
	public String search(@ModelAttribute("song")Songs song) {
		
		return "redirect:/search/"+song.getArtist();
		
	}
	@RequestMapping("/search/{artist}")
	public String searchprocess(Model model, @ModelAttribute("song")Songs song,@PathVariable("artist") String artist) {
		List<Songs> songInfo = songserservice.getSongByArtist(artist);
		if(songInfo.size()>0) {
			model.addAttribute("songInfo",songInfo);
			model.addAttribute("artist",artist);
			return "searchResult.jsp";
		}else {
			return "redirect:/dashboard";
		}
		
	}
	
	
	
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Songs song) {
		
		return"newSong.jsp";
	}
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public String crestSong(@Valid @ModelAttribute("song") Songs song,BindingResult result) {
		if (result.hasErrors()) {
			
			return"newSong.jsp";
		} else {

			songserservice.creatSong(song);

			return "redirect:/dashboard";
		}
		
	}
	
	
	@RequestMapping("/songs/delete/{id}")
	public String deletesong(@PathVariable("id")Long id) {
		songserservice.deleteSong(id);
		return "redirect:/dashboard";
	}
	@RequestMapping("/topten")
	public String topTen(Model model) {
		List<Songs> topTenSongs=songserservice.topTen();
		System.out.println("hauuuuuuuu");
		model.addAttribute("topTenSongs",topTenSongs);
	
		return "topTen.jsp";
	}
}
