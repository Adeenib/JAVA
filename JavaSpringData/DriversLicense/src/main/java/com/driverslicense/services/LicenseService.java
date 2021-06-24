package com.driverslicense.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.driverslicense.models.License;
import com.driverslicense.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository licenserepository;

	public LicenseService(LicenseRepository licenserepository) {
		this.licenserepository = licenserepository;
	}
	
	public void CreatLicense(License license) {
		licenserepository.save(license);
		
	}
	public Integer lastNumber() {
		License license = licenserepository.findTopByOrderByNumberDesc();
		if (license == null) {
			return 1;
		}
		
		return license.getNumber()+1;
	}


}
