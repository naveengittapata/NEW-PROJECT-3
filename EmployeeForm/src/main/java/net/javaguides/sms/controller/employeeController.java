package net.javaguides.sms.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.sms.entity.EmployeeEntity;

public class employeeController {
	@GetMapping("/Employee")
	public String EmployeeForm (Model model) {
		EmployeeEntity Employee = new EmployeeEntity();
		model.addAttribute("Employees", Employee);
		return "Employee";
	
		
	}

}
