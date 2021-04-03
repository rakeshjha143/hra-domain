/**
 * 
 */
package com.hra.domain.application.service;

import java.util.List;

import com.hra.domain.application.entity.Jobs;

/**
 * @author Rakeshjha
 *
 */
public interface JobsServices {
	
	public List<Jobs> getAllJobsList();
	
	public Jobs getJobById(Long id);

}
