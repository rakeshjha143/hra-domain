/**
 * 
 */
package com.hra.domain.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hra.domain.application.entity.Jobs;

/**
 * @author Rakeshjha
 *
 */
@Repository
public interface JobsRepository extends JpaRepository<Jobs, Long>{
	

}
