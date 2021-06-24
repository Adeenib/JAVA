package com.driverslicense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.driverslicense.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
	License findTopByOrderByNumberDesc();
	

}
