package com.employee.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public class EmployeeRepo {
	
	
	private List<Employee> employees
	=new ArrayList<>();
	
	public Employee add(Employee emp) {
		employees.add(emp);
		return emp;
	}
	
	public Employee findById(Long id) {
		return employees.stream()
				.filter(e -> e.id().equals(id))
				.findFirst()
				.orElseThrow();
	}
	
	public List<Employee> findAll() {
		return employees;
	}
	
	public List<Employee> findByDepartment(Long departmentId){
		return employees.stream()
				.filter(e -> e.departmentId()
						.equals(departmentId))
				.toList();
	}
}
