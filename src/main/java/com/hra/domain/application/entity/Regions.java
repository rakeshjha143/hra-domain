/**
 * 
 */
package com.hra.domain.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Rakeshjha
 *
 */
@Entity
@Data
@Table()
public class Regions {
	

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "REGION_ID", nullable = false)
	  private Long regions_id;
	  
	  @Column(name = "REGION_NAME", nullable = false)
	  private String regions_name;
   
	
}
