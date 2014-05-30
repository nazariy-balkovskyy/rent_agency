package com.balkovskyy.rentagency.web.dto.builders;

import com.balkovskyy.rentagency.web.domain.City;
import com.balkovskyy.rentagency.web.dto.CityDTO;

public class CityDTOBuilder {
	public static CityDTO toCityDTO(City city) {
		CityDTO dto = new CityDTO();
		dto.setId(city.getId());
		dto.setName(city.getName());
		dto.setDefault(city.isDefault());
		return dto;
	}
}
