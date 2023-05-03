package com.mcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="employee_details")
@Component
@NamedQuery(name = "EmployeeDetails.findByEmployeeName", query = "SELECT u FROM EmployeeDetails u WHERE u.employeeName = :employeeName")
public class EmployeeDetails {
	
	@Id
	@Column(name="id_Employee")
	private int idEmployee;
	
	@Column(name="employee_Name")
	private String employeeName;
	
	@Column(name="emp_password")
	private String password;

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", employeeName=" + employeeName + ", password=" + password + "]";
	}
	
	

}
