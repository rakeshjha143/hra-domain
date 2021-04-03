/**
 * 
 */
package com.hra.domain.application.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author Rakeshjha
 *
 */
@Entity
@Data
@Table(name="locations")
@Component
public class Locations {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "LOCATION_ID", nullable = false)
	  private Long location_id;
	  
	  @Column(name = "STREET_ADDRESS", nullable = false)
	  private String street_address;
	  
	  @Column(name = "POSTAL_CODE", nullable = false)
	  private String postal_code;
	  
	  @Column(name = "CITY", nullable = false)
	  private String city;
	  
	  @Column(name = "STATE_PROVINCE", nullable = false)
	  private String state_province;
	  
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "COUNTRY_ID")
	  private Country country;

}
