package com.employee.controller;

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

import com.employee.model.Employee;
import com.employee.repo.EmployeeRepo;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	private static final Logger LOGGER
	=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private EmployeeClient employeeClient;
	
	
	@PostMapping("/save")
	public Employee add(@RequestBody Employee emp) {
		LOGGER.info("Department add : {}" ,emp);
		return empRepo.add(emp);
	}
	
	@GetMapping("/all")
	public List<Employee> findAll(){
		LOGGER.info("Departments List : " );
		return empRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable Long id) {
		LOGGER.info("Department found with id =  {}" ,id);
		return empRepo.findById(id);
	}
	
	@GetMapping("/dept/{departmentId}")
	public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId){
		LOGGER.info("Employee find : departmentId = {}", departmentId);
		return empRepo.findByDepartment(departmentId);
				
	}
}
