package com.main.sbp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.sbp.entity.Address;
import com.main.sbp.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public Address saveAddress (Address address) {
		Address addressSavedToDB = addressRepository.save(address);
		return addressSavedToDB;
	}

}
