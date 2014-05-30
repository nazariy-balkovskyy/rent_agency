package com.balkovskyy.rentagency.web.dto.builders;

import java.util.ArrayList;
import java.util.List;

import com.balkovskyy.rentagency.web.domain.Mark;
import com.balkovskyy.rentagency.web.dto.MarkDTO;

public class MarkDTOBuilder {
	public static MarkDTO toMarkDTO(Mark mark) {
		MarkDTO dto = new MarkDTO();
		dto.setId(mark.getId());
//		dto.setUser(mark.getUser());
//		dto.setAdvertisement(mark.getAdvertisement());
		dto.setValue(mark.getValue());
		return dto;
	}
	public static List<MarkDTO> toMarkListDTO(List<Mark> list) {
		List<MarkDTO> dtoList = new ArrayList<MarkDTO>();
		for(Mark obj:list){
			dtoList.add(toMarkDTO(obj));
		}
		return dtoList;
	}

}
