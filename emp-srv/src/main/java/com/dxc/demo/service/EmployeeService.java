/**
 * 
 */
package com.dxc.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.dxc.demo.repository.EmployeeRepository;
import com.dxc.demo.entity.Employee;

/**
 * @author aeltayary
 *
 */
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	Environment environment;

	public Employee getEmployee(Integer empNo) {
		Employee emp = null;
		Optional<Employee> result = empRepo.findById(empNo);
		if (result.isPresent()) {
			emp = result.get();
			String servicePort=environment.getProperty("local.server.port");
			emp.setPort(servicePort);
		}
		return emp;

	}

}
