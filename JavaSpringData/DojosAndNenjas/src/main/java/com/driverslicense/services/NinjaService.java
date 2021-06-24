package com.driverslicense.services;

import org.springframework.stereotype.Service;

import com.driverslicense.models.Ninja;
import com.driverslicense.repositories.NinjaRepository;

@Service
public class NinjaService {
	public NinjaRepository ninjaRepository;

	
	
	public NinjaService(NinjaRepository ninjaRepository) {
		
		this.ninjaRepository = ninjaRepository;
	}



	public void creatNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
}
