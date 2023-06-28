package com.main.sbp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.sbp.entity.Address;
import com.main.sbp.entity.Employee;
import com.main.sbp.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressService addressService;
	
	@Transactional
	public Employee saveEmployee (Employee employee) {
		Employee employeeSavedToDB = employeeRepository.save(employee);
		
		Address address = null;
		address.setAddress("Kolhapur");
		address.setEmployee(employee);
		
		addressService.saveAddress(address);
		return employeeSavedToDB;
	}
}
