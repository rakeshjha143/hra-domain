/**
 * 
 */
package com.hra.domain.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hra.domain.application.service.CountryService;
import com.hra.domain.application.service.DepartmentsServices;
import com.hra.domain.application.service.JobsServices;
import com.hra.domain.application.service.LocationServices;
import com.hra.domain.application.service.RegionServices;

/**
 * @author Rakeshjha
 * this is controller class for admin 
 */
@Controller
public class RegionsController {
	
	@Autowired
	private RegionServices regionServices;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private LocationServices locationServices;
	
	@Autowired
	private JobsServices jobsService;
	
	@Autowired
	private DepartmentsServices deprtService;
	
	
    @GetMapping("/regions")
    public String region(Model model) {
        model.addAttribute("regions", regionServices.getAllRegions());
        return "admin/region";
    }
	
    @GetMapping("/country")
    public String country(Model model) {
        model.addAttribute("countrys", countryService.AllCountry());
        return "admin/country";
    }
	
    @GetMapping("/location")
    public String location(Model model) {
        model.addAttribute("locations", locationServices.allLocations());
        return "admin/location";
    }
    
    @GetMapping("/jobs")
    public String typeOfjobs(Model model) {
        model.addAttribute("jobslist", jobsService.getAllJobsList());
        return "admin/jobs";
    }
    @GetMapping("/departments")
    public String listOfDepartments(Model model) {
        model.addAttribute("departmentslist", deprtService.getAllDepartments());
        return "admin/departments";
    }

}
