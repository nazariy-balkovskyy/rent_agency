package com.balkovskyy.rentagency.web.dto.builders;

import java.util.ArrayList;
import java.util.List;

import com.balkovskyy.rentagency.web.domain.Location;
import com.balkovskyy.rentagency.web.dto.LocationDTO;

public class LocationDTOBuilder {
	public static LocationDTO toLocationDTO(Location location) {
		LocationDTO dto = new LocationDTO();
		dto.setId(location.getId());
		dto.setCity(CityDTOBuilder.toCityDTO(location.getCity()));
		dto.setRegion(RegionDTOBuilder.toRegionDTO(location.getRegion()));
		dto.setLongitude(location.getLongitude());
		dto.setLatitude(location.getLatitude());
		dto.setFriendlyName(location.getFriendlyName());
		return dto;
	}
	public static List<LocationDTO> toLocationListDTO(List<Location> list) {
		List<LocationDTO> dtoList = new ArrayList<LocationDTO>();
		for(Location obj:list){
			dtoList.add(toLocationDTO(obj));
		}
		return dtoList;
	}

}
