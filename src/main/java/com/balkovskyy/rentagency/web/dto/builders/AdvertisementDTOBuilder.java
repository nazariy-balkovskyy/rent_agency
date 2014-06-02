package com.balkovskyy.rentagency.web.dto.builders;

import java.util.ArrayList;
import java.util.List;

import com.balkovskyy.rentagency.web.domain.Advertisement;
import com.balkovskyy.rentagency.web.dto.AdvertisementDTO;

public class AdvertisementDTOBuilder {
	
	public static AdvertisementDTO toAdvertisementDTO(Advertisement adv){
		AdvertisementDTO dto = new AdvertisementDTO();
		dto.setId(adv.getId());
		//FIXME fix this
		dto.setUser(UserDTOBuilder.toUserDTO(adv.getUser()));
		dto.setFlatType(FlatTypeDTObuilder.toFlatTypeDTO(adv.getFlatType()));
		dto.setState(AdvertisementStateDTOBuilder.toAdvertisementStateDTO(adv.getState()));
		dto.setLocation(LocationDTOBuilder.toLocationDTO(adv.getLocation()));
		dto.setRentType(RentTypeDTOBuilder.toRentTypeDTO(adv.getRentType()));
		dto.setPrice(adv.getPrice());
		dto.setName(adv.getName());
		dto.setDescription(adv.getDescription());
		dto.setViewsCount(adv.getViewsCount());
		dto.setRoomsCount(adv.getRoomsCount());
		dto.setFloorNumber(adv.getFloorNumber());
		dto.setDate(adv.getDate());
		if(adv.getPhoto() != null){
			dto.setPhoto(adv.getPhoto().getPath());
		}
		return dto;
	}
	
	public static List<AdvertisementDTO> totoAdvertisementListDTO(List<Advertisement> list){
		List<AdvertisementDTO> result = new ArrayList<AdvertisementDTO>();
		for(Advertisement adv:list){
			result.add(toAdvertisementDTO(adv));
		}
		return result;
	}
}
