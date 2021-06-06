package com.jgabriel.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jgabriel.crud.model.Crud;

@Repository
public interface CrudRepository extends JpaRepository<Crud, Long> {
	
}
