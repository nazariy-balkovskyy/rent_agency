package com.balkovskyy.rentagency.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.balkovskyy.rentagency.web.dto.RentTypeDTO;
import com.balkovskyy.rentagency.web.dto.builders.RentTypeDTOBuilder;
import com.balkovskyy.rentagency.web.services.RentTypeService;

@Controller
@RequestMapping("/renttypes")
public class RentTypesController {

	@Autowired
	private RentTypeService typeService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<RentTypeDTO> getList(){
		return RentTypeDTOBuilder.toRentTypeListDTO(typeService.getTypes());
	}
}
