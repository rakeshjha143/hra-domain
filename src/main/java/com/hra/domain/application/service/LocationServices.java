/**
 * 
 */
package com.hra.domain.application.service;

import java.util.List;

import com.hra.domain.application.entity.Locations;

/**
 * @author Rakeshjha
 *
 */
public interface LocationServices {
	
	public List<Locations> allLocations();
	
	public Locations getLocationByid(Long id);

}
