/**
 * 
 */
package com.hra.domain.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hra.domain.application.entity.Locations;

/**
 * @author Rakeshjha
 *
 */
@Repository
public interface LocationRepository extends JpaRepository<Locations, Long>{

}
