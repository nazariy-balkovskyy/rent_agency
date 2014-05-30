package com.balkovskyy.rentagency.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.balkovskyy.rentagency.web.services.RegionService;

@Controller
@RequestMapping("/regions")
public class RegionsController {

	@Autowired
	private RegionService regionService;
}
