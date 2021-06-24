package com.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.driverslicense.models.Dojo;
import com.driverslicense.repositories.DojoRepository;

@Service
public class DojoService {
	public DojoRepository dojoRepository;

	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public void creatDojo(Dojo dojo) {
		dojoRepository.save(dojo);
		
	}
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
		
	}
	public Dojo finedDojo(Long id) {
		
		return dojoRepository.findById(id).orElse(null);
	}
	

}
