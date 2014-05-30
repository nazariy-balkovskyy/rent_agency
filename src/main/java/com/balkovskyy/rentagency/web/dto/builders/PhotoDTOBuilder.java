package com.balkovskyy.rentagency.web.dto.builders;

import java.util.ArrayList;
import java.util.List;

import com.balkovskyy.rentagency.web.domain.Photo;
import com.balkovskyy.rentagency.web.dto.PhotoDTO;

public class PhotoDTOBuilder {
	public static PhotoDTO toPhotoDTO(Photo photo) {
		PhotoDTO dto = new PhotoDTO();
		dto.setId(photo.getId());
		//dto.setAdvertisement(photo.getAdvertisement());
		dto.setPath(photo.getPath());
		dto.setDefault(photo.isDefault());
		return dto;
	}
	public static List<PhotoDTO> toPhotoListDTO(List<Photo> list) {
		List<PhotoDTO> dtoList = new ArrayList<PhotoDTO>();
		for(Photo obj:list){
			dtoList.add(toPhotoDTO(obj));
		}
		return dtoList;
	}

}
