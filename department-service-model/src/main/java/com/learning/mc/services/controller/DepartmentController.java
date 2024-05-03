package com.learning.mc.services.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.mc.services.model.Department;
import com.learning.mc.services.repository.DeptRepo;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	private static final Logger LOGGER
	=LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DeptRepo deptRepo;
	
	
	@PostMapping("/save")
	public Department add(@RequestBody Department dept) {
		LOGGER.info("Department add : {}" ,dept);
		return deptRepo.addDepartment(dept);
	}
	
	@GetMapping("/all")
	public List<Department> findAll(){
		LOGGER.info("Departments List : " );
		return deptRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Department findById(@PathVariable Long id) {
		LOGGER.info("Department found with id =  {}" ,id);
		return deptRepo.findById(id);
	}
}
