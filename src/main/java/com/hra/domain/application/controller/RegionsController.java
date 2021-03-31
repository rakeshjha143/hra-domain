/**
 * 
 */
package com.hra.domain.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hra.domain.application.entity.Regions;
import com.hra.domain.application.service.RegionServices;

/**
 * @author Rakeshjha
 * this is controller class for admin 
 */
@Controller
public class RegionsController {
	
	@Autowired
	private RegionServices regionServices;
	
	
    @GetMapping("/regions")
    public String index(Model model) {
        model.addAttribute("regions", regionServices.getAllRegions());
        return "admin/list";
    }
	
	

}
