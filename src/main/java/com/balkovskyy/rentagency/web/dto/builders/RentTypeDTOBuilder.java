package com.balkovskyy.rentagency.web.dto.builders;

import java.util.ArrayList;
import java.util.List;

import com.balkovskyy.rentagency.web.domain.RentType;
import com.balkovskyy.rentagency.web.dto.RentTypeDTO;

public class RentTypeDTOBuilder {
	public static RentTypeDTO toRentTypeDTO(RentType renttype) {
		RentTypeDTO dto = new RentTypeDTO();
		dto.setId(renttype.getId());
		dto.setName(renttype.getName());
		return dto;
	}
	public static List<RentTypeDTO> toRentTypeListDTO(List<RentType> list) {
		List<RentTypeDTO> dtoList = new ArrayList<RentTypeDTO>();
		for(RentType obj:list){
			dtoList.add(toRentTypeDTO(obj));
		}
		return dtoList;
	}

}
