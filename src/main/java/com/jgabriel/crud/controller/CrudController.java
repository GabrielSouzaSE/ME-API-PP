package com.jgabriel.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jgabriel.crud.model.Crud;
import com.jgabriel.crud.repository.CrudRepository;

@RestController
@RequestMapping("/curso")
public class CrudController {
	
	@Autowired
	private CrudRepository crudRepository;
	
	@GetMapping //("/listar") // localhost:8080/crud/listar
	public List<Crud> listar() {
		return crudRepository.findAll();
	}
	
	@PostMapping //("/add") // localhost:8080/crud/add
	@ResponseStatus(HttpStatus.CREATED)
	public Crud adicionar(@RequestBody Crud crud) {
		return crudRepository.save(crud);
	}
	
	@DeleteMapping //("/apagar") // localhost:8080/crud/apagar
	public void deletar(@RequestBody Crud crud) {
		crudRepository.delete(crud);
	}
	
	@PutMapping //("/atualizar") // localhost:8080/crud/atualizar
	public Crud atualizar(@RequestBody Crud crud) {
		return crudRepository.save(crud);
	}
	
	
}
