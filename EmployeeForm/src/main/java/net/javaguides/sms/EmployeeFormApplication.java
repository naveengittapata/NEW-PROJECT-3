package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeFormApplication.class, args);
	}
	
//	@Autowired
//	private EmployeeRepository employeeRepository;

}
