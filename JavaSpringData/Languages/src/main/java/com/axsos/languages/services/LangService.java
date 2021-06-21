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
		 Optional<LangModels> optionalLang=langrepository.findById(id);
		  if(optionalLang.isPresent()) {
		         return optionalLang.get();
		     } else {
		         return null;
		     }
		
		
	}
	 public void deleteLang(long id) {
		 
		 langrepository.deleteById(id);
	}
	 public LangModels updateLang(LangModels langNew,Long id) {
		 System.out.println("hay333");
		 LangModels lang= langInfo(id);
		 lang.setId(id);
		 lang.setName(langNew.getName());
		 lang.setCreator(langNew.getCreator());
		 lang.setVersion(langNew.getVersion());
		 langrepository.save(lang);
		 return lang;
	}
}
