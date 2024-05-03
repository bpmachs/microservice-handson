package com.learning.mc.services.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.learning.mc.services.model.Department;

@Repository
public class DeptRepo  {
	
	private List<Department> depts = new ArrayList<>();
	
	
	public Department addDepartment(Department department) {
		depts.add(department);
		return department;
	}
	
	public Department findById(Long id) {
		return depts.stream().
				filter(dept -> dept.getId().equals(id))
				.findFirst()
				.orElseThrow();
				}
	
	public List<Department> findAll(){
		return depts;
	}
}
