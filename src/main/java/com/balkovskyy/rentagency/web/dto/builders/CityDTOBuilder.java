package com.balkovskyy.rentagency.web.dto.builders;

import java.util.ArrayList;
import java.util.List;

import com.balkovskyy.rentagency.web.domain.City;
import com.balkovskyy.rentagency.web.dto.CityDTO;

public class CityDTOBuilder {
	public static CityDTO toCityDTO(City city) {
		CityDTO dto = new CityDTO();
		dto.setId(city.getId());
		dto.setName(city.getName());
		dto.setDefault(city.isDefault());
		dto.setRegions(RegionDTOBuilder.toRegionListDTO(city.getRegions()));
		return dto;
	}
	
	public static List<CityDTO> toCityListDTO(List<City> list) {
		List<CityDTO> dtoList = new ArrayList<CityDTO>();
		for(City obj:list){
			dtoList.add(toCityDTO(obj));
		}
		return dtoList;
	}
}
