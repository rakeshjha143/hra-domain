/**
 * 
 */
package com.hra.domain.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hra.domain.application.entity.Departments;

/**
 * @author Rakeshjha
 *
 */
@Repository
public interface DepartmentsRepository extends JpaRepository<Departments, Long>{
	
	@Query(value="select * from departments INNER join Locations on departments.location_id=locations.location_id", nativeQuery = true)
	public List<Departments> allDepartmentandlocation();

}
