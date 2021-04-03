/**
 * 
 */
package com.hra.domain.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hra.domain.application.entity.Jobs;
import com.hra.domain.application.repository.JobsRepository;
import com.hra.domain.application.service.JobsServices;

/**
 * @author Rakeshjha
 *
 */
@Service
public class JobsServicesImpl implements JobsServices{
	
	
	@Autowired
	private JobsRepository jobsRepo;

	@Override
	public List<Jobs> getAllJobsList() {
		
		List<Jobs> listOfJobs=jobsRepo.findAll();
		
		return listOfJobs;
	}

	@Override
	public Jobs getJobById(Long id) {
		
		return jobsRepo.getOne(id);
	}

}
