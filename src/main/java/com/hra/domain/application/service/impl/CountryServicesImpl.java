/**
 * 
 */
package com.hra.domain.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hra.domain.application.entity.Country;
import com.hra.domain.application.repository.CountryRepository;
import com.hra.domain.application.service.CountryService;

/**
 * @author Rakeshjha
 *
 */
@Service
public class CountryServicesImpl implements CountryService{
	
	@Autowired
	private CountryRepository countryRepository;

	@Override
	public List<Country> AllCountry() {
		
		List<Country> listCountry=countryRepository.findAll();
		
		return listCountry;
	}

	@Override
	public Country getCountryById(Long id) {
		// TODO Auto-generated method stub
		return countryRepository.getOne(id);
	}

}
