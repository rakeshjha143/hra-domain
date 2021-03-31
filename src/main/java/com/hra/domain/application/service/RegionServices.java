/**
 * 
 */
package com.hra.domain.application.service;

import java.util.List;

import com.hra.domain.application.entity.Regions;

/**
 * @author Rakeshjha
 *
 */
public interface RegionServices {
	
	public List<Regions> getAllRegions();
	
	public Regions getRegionsByid(Long id);
	
	
	
	

}
