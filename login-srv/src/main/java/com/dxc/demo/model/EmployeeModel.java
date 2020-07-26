package com.dxc.demo.model;

import java.io.Serializable;

import java.util.Date;


/**
 * The persistent class for the employees database table.
 * 
 */

public class EmployeeModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer empNo;

	private Date birthDate;

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	
	private String firstName;

	private String gender;

	
	private Date hireDate;

	
	private String lastName;
	

	private String port; 

	public EmployeeModel() {
	}

	public Integer getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}