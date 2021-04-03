/**
 * 
 */
package com.hra.domain.application.service;

import java.util.List;

import com.hra.domain.application.entity.Country;

/**
 * @author Rakeshjha
 *
 */
public interface CountryService {
	
	
	public List<Country> AllCountry();
	
	public Country getCountryById(Long id);

}
