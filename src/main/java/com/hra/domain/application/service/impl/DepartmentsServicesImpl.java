/**
 * 
 */
package com.hra.domain.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hra.domain.application.entity.Departments;
import com.hra.domain.application.repository.DepartmentsRepository;
import com.hra.domain.application.service.DepartmentsServices;

/**
 * @author Rakeshjha
 *
 */
@Service
public class DepartmentsServicesImpl implements DepartmentsServices{
	
	@Autowired
	private DepartmentsRepository departmentRepository;

	@Override
	@Transactional
	public List<Departments> getAllDepartments() {
		List<Departments> listDepartments=departmentRepository.allDepartmentandlocation();
		return listDepartments;
	}

	@Override
	public Departments getDepartmentsById(Long id) {
		
		return departmentRepository.getOne(id);
	}

}
