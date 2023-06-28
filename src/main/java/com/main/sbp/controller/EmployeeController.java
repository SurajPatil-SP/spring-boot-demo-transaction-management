package com.main.sbp.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.sbp.entity.Employee;
import com.main.sbp.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> saveEmployee (@RequestBody Employee employee) {
		
		Employee saveEmployeeToDB = employeeService.saveEmployee(employee);
		
		if (Objects.nonNull(saveEmployeeToDB)) {
			return new ResponseEntity<Employee> (saveEmployeeToDB, HttpStatus.CREATED);
		}
		return new ResponseEntity<Employee> (HttpStatus.NOT_FOUND);
	}
}
