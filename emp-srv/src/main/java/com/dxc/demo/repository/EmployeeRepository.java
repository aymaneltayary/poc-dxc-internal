/**
 * 
 */
package com.dxc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.dxc.demo.entity.Employee;


/**
 * @author aeltayary
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
