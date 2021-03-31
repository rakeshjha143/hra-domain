/**
 * 
 */
package com.hra.domain.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hra.domain.application.entity.Regions;
import com.hra.domain.application.repository.RegionsRepository;
import com.hra.domain.application.service.RegionServices;

/**
 * @author Rakeshjha
 *
 */
@Service
public class RegionServicesImpl implements RegionServices{

	@Autowired
	private RegionsRepository regionsRepository;
	
	@Override
	public List<Regions> getAllRegions() {
		List<Regions> listofreg=regionsRepository.findAll();
		return listofreg;
	}

	@Override
	public Regions getRegionsByid(Long id) {
		
		return regionsRepository.getOne(id);
	}

}
