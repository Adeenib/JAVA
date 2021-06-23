package com.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.lookify.models.Songs;
import com.lookify.repository.SongsRepository;
@Service
public class SongsService {
	private final SongsRepository songrepoitory;

	public SongsService(SongsRepository songrepo) {
		
		this.songrepoitory = songrepo;
	}
	public List<Songs> allSongs() {
		return (List<Songs>) songrepoitory.findAll();
		
		
	}
	public List<Songs> getSongByArtist(String artist) {
	return	 songrepoitory.findByArtist(artist);
		
	}
	public void creatSong(Songs song) {
		songrepoitory.save(song);
	}
	public void deleteSong(Long id) {
		songrepoitory.deleteById(id);
	}
	public List<Songs> topTen() {
		return  songrepoitory.findTop10ByOrderByRatingDesc();
		
		
	}
	
 
}
