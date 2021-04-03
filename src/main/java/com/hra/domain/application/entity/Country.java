/**
 * 
 */
package com.hra.domain.application.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Rakeshjha
 *
 */
@Entity
@Data
@Table(name="countries")
public class Country {
	

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "COUNTRY_ID", nullable = false)
	  private Long country_id;
	  
	  @Column(name = "COUNTRY_CODE", nullable = false)
	  private String country_code;
	  
	  @Column(name = "COUNTRY_NAME", nullable = false)
	  private String country_name;

	  @ManyToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "REGION_ID")
	  private Regions regions;
	  
	  
	  
	

}
