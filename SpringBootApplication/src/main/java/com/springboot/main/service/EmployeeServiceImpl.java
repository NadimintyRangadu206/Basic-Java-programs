package com.springboot.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.main.entity.Employee;
import com.springboot.main.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	public EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
	Optional<Employee> optional=employeeRepository.findById(employeeId);
	
	if(optional.isPresent()) {
		 employeeRepository.findtById(employeeId);
	}
	else {
	System.out.println("Employee Id Is not exist or not match");
	}
	return null;
	

	}

	
	
		

}
