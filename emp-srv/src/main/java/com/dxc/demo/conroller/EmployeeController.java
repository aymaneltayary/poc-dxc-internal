/**
 * 
 */
package com.dxc.demo.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.demo.entity.Employee;
import com.dxc.demo.service.EmployeeService;

/**
 * @author aeltayary
 *
 */
@RestController
public class EmployeeController {

@Autowired
private EmployeeService serv;



@GetMapping("/employee/{empNo}")
public Employee getProfile(@PathVariable("empNo") Integer empNo) {
	Employee result=serv.getEmployee(empNo);
	return  result;
}


}
