package com.axsos.languages.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.axsos.languages.models.LangModels;
import com.axsos.languages.repository.LangRepository;




@Service
public class LangService {
	private final LangRepository langrepository;

	public LangService(LangRepository langrepository) {
		
		this.langrepository = langrepository;
	}
	public List<LangModels> allLang() {
		return langrepository.findAll();
		
	}
	 public LangModels createLang(LangModels b) {
	     return langrepository.save(b);

}
	 public LangModels langInfo(long id) {
		 return langrepository.findById(id).orElse(null);
		
		
	}
	 public void deleteLang(long id) {
		 
		 langrepository.deleteById(id);
	}
	 public void updateLang(LangModels langNew) {
		
		 langrepository.save(langNew);
		 
	}
}
