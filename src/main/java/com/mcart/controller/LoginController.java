package com.mcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcart.model.EmployeeDetails;
import com.mcart.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@GetMapping("/{userName}/{password}")
	public String loginUser(@PathVariable("userName") String userName,@PathVariable("password") String password) {
		EmployeeDetails emp=loginService.loginUser(userName, password);
		
		return emp.getEmployeeName();
	}
}
