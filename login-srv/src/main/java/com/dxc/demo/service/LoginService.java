/**
 * 
 */
package com.dxc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dxc.demo.model.EmployeeModel;
import com.dxc.demo.model.LoginModel;
import com.dxc.demo.webClient.EmployeeWebClient;


/**
 * @author aeltayary
 *
 */
@Service
public class LoginService {


@Autowired
EmployeeWebClient webClient;

	
public EmployeeModel login(@RequestBody LoginModel loginModel) {
	
	return	webClient.getEmployeeProfile(loginModel.getEmpId());
	
}



}
