/**
 * 
 */
package com.hra.domain.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hra.domain.application.entity.Locations;
import com.hra.domain.application.repository.LocationRepository;
import com.hra.domain.application.service.LocationServices;

/**
 * @author Rakeshjha
 *
 */
@Service
public class LocationServiceImpl implements LocationServices {
	
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public List<Locations> allLocations() {
		List<Locations> lilocation=locationRepository.findAll();
		return lilocation;
	}

	@Override
	public Locations getLocationByid(Long id) {
		
		return locationRepository.getOne(id);
	}

}
