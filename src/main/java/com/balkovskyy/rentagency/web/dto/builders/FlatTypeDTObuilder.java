package com.balkovskyy.rentagency.web.dto.builders;

import java.util.ArrayList;
import java.util.List;

import com.balkovskyy.rentagency.web.domain.FlatType;
import com.balkovskyy.rentagency.web.dto.FlatTypeDTO;

public class FlatTypeDTObuilder {
	public static FlatTypeDTO toFlatTypeDTO(FlatType flattype) {
		FlatTypeDTO dto = new FlatTypeDTO();
		dto.setId(flattype.getId());
		dto.setName(flattype.getTypeName());
		return dto;
	}
	public static List<FlatTypeDTO> toFlatTypeListDTO(List<FlatType> list) {
		List<FlatTypeDTO> dtoList = new ArrayList<FlatTypeDTO>();
		for(FlatType obj:list){
			dtoList.add(toFlatTypeDTO(obj));
		}
		return dtoList;
	}
}
