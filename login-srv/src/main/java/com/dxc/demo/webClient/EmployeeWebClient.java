/**
 * 
 */
package com.dxc.demo.webClient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dxc.demo.model.EmployeeModel;



/**
 * @author aeltayary
 *
 */
//@FeignClient(name = "employee-service")
@FeignClient(name = "zuual-srv")
public interface EmployeeWebClient {

	
	
@GetMapping("/employee-service/employee/{empNo}")
public EmployeeModel getEmployeeProfile(@PathVariable("empNo") Integer empNo) ;

}
