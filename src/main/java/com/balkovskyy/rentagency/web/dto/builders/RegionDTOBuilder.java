package com.balkovskyy.rentagency.web.dto.builders;

import java.util.ArrayList;
import java.util.List;

import com.balkovskyy.rentagency.web.domain.Region;
import com.balkovskyy.rentagency.web.dto.RegionDTO;

public class RegionDTOBuilder {
	public static RegionDTO toRegionDTO(Region region) {
		RegionDTO dto = new RegionDTO();
		dto.setId(region.getId());
		dto.setCity(CityDTOBuilder.toCityDTO(region.getCity()));
		dto.setName(region.getName());
		return dto;
	}
	public static List<RegionDTO> toRegionListDTO(List<Region> list) {
		List<RegionDTO> dtoList = new ArrayList<RegionDTO>();
		for(Region obj:list){
			dtoList.add(toRegionDTO(obj));
		}
		return dtoList;
	}

}
