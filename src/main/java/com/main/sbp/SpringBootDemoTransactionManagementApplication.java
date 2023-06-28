package com.main.sbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootDemoTransactionManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoTransactionManagementApplication.class, args);
	}

}
