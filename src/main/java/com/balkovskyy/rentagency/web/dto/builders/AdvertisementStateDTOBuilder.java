package com.balkovskyy.rentagency.web.dto.builders;

import java.util.ArrayList;
import java.util.List;

import com.balkovskyy.rentagency.web.domain.AdvertisementState;
import com.balkovskyy.rentagency.web.dto.AdvertisementStateDTO;

public class AdvertisementStateDTOBuilder {
	public static AdvertisementStateDTO toAdvertisementStateDTO(AdvertisementState advertisementstate) {
		AdvertisementStateDTO dto = new AdvertisementStateDTO();
		dto.setId(advertisementstate.getId());
		dto.setName(advertisementstate.getName());
		return dto;
	}
	public static List<AdvertisementStateDTO> toAdvertisementStateListDTO(List<AdvertisementState> list) {
		List<AdvertisementStateDTO> dtoList = new ArrayList<AdvertisementStateDTO>();
		for(AdvertisementState obj:list){
			dtoList.add(toAdvertisementStateDTO(obj));
		}
		return dtoList;
	}
}
