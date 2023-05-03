package com.mcart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mcart.model.EmployeeDetails;
import com.mcart.repository.EmployeeRepository;

@Service
public class LoginService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeDetails employeeDetails;

	public EmployeeDetails loginUser(String employeeName,String password)
	{
		List<EmployeeDetails>empList=employeeRepository.findAll();
		List<EmployeeDetails> emp=employeeRepository.findByEmployeeName(employeeName);
		
		empList.stream().forEach(e->{
			if(e.getEmployeeName().equalsIgnoreCase(employeeName)) {
				employeeDetails=e;
			}
		});
		return employeeDetails;
	}
}
