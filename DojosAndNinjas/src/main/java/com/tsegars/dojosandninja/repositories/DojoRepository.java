package com.tsegars.dojosandninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tsegars.dojosandninja.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{
	// Retrieve All Dojos
	List<Dojo> findAll();

}