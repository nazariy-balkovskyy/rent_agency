package com.balkovskyy.rentagency.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.balkovskyy.rentagency.web.services.LocationService;

@Controller
@RequestMapping("/locations")
public class LocationController {

	@Autowired
	private LocationService locationService;
}
