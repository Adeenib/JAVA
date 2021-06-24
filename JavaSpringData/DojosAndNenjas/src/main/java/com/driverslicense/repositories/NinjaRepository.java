package com.driverslicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.driverslicense.models.Ninja;


@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	

}
