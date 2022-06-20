package com.tsegars.dojosandninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tsegars.dojosandninja.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	// Retrieve All Ninjas
	List<Ninja> findAll();
}