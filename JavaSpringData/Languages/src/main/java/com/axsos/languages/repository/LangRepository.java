package com.axsos.languages.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.axsos.languages.models.LangModels;

public interface LangRepository extends CrudRepository<LangModels, Long> {
	
	List<LangModels> findAll();
	
	
	

}
