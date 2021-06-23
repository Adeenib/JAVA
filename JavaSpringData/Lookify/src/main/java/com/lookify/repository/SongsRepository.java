package com.lookify.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lookify.models.Songs;
@Repository
public interface SongsRepository extends CrudRepository<Songs, Long> {
	List<Songs> findByArtist(String artist);
	public List<Songs> findTop10ByOrderByRatingDesc();
	
}