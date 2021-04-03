/**
 * 
 */
package com.hra.domain.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hra.domain.application.entity.Country;

/**
 * @author Rakeshjha
 *
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{
	
	

}
