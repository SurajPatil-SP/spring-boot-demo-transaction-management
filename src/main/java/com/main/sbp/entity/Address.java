package com.main.sbp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String address;
	
	@OneToOne
	private Employee employee;
}
