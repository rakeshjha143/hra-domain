/**
 * 
 */
package com.hra.domain.application.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Rakeshjha
 *
 */
@Entity
@Data
@Table(name="departments")
public class Departments {

	 @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "DEPARTMENT_ID", nullable = false)
	  private Long departments_id;
	  
	  @Column(name = "DEPARTMENT_NAME", nullable = false)
	  private String departments_name;
	  
	  @Column(name = "MANAGER_ID", nullable = false)
	  private Long manager_emp;
	  
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "LOCATION_ID")
	  private Locations locations;
	
	  

	  
	  
}
