package com.learning.mc.services.client;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.learning.mc.services.model.Employee;

@HttpExchange
public interface EmployeeClient {
	
	
	@GetExchange("/dept/{departmentId}")
	public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
}
