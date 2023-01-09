package com.springboot.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.entity.Employee;
import com.springboot.main.service.EmployeeService;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;

	@PostMapping("save/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {

		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.OK);
	}
	
	@GetMapping("get/employee")
	public ResponseEntity<List<Employee>> getEmployee(){	
		return new ResponseEntity<List<Employee>>(employeeService.getEmployee(),HttpStatus.ACCEPTED);
	}
	@GetMapping("get/emplyee{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int employeeId){	
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.ACCEPTED);
	}

}
