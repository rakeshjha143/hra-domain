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
@Table(name="jobs")
public class Jobs {
	

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "JOB_ID", nullable = false)
	  private Long jobid;
	  
	  @Column(name = "JOB_CODE", nullable = false)
	  private String job_code;
	  
	  @Column(name = "JOB_TITLE", nullable = false)
	  private String job_title;
	  
	  @Column(name = "MIN_SALARY", nullable = false)
	  private double min_salary;
	  
	  @Column(name = "MAX_SALARY", nullable = false)
	  private double max_salary;
	  

}
