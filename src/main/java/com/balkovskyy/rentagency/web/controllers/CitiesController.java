package com.balkovskyy.rentagency.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.balkovskyy.rentagency.web.dto.CityDTO;
import com.balkovskyy.rentagency.web.dto.builders.CityDTOBuilder;
import com.balkovskyy.rentagency.web.services.CityService;

@Controller
@RequestMapping("/cities")
public class CitiesController {

	@Autowired
	private CityService cityService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<CityDTO> getCities(){
		return CityDTOBuilder.toCityListDTO(cityService.findAllCities());
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public CityDTO getCityById(@PathVariable Long id){
		return CityDTOBuilder.toCityDTO(cityService.findCityById(id));
	}
}
