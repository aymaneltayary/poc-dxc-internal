/**
 * 
 */
package com.dxc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.demo.model.EmployeeModel;
import com.dxc.demo.model.LoginModel;
import com.dxc.demo.service.LoginService;



/**
 * @author aeltayary
 *
 */
@RestController
public class LoginController {


@Autowired
LoginService serv;
	
	
@PostMapping("/login")
public EmployeeModel login(@RequestBody LoginModel mod) {
	
	return serv.login(mod);
	
}


}
