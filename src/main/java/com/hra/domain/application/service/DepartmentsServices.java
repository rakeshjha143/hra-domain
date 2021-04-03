/**
 * 
 */
package com.hra.domain.application.service;

import java.util.List;

import com.hra.domain.application.entity.Departments;

/**
 * @author Rakeshjha
 *
 */
public interface DepartmentsServices {
	
	
	public List<Departments> getAllDepartments();
	
	public Departments getDepartmentsById(Long id);

}
