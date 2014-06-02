package com.balkovskyy.rentagency.web.services;

import java.util.List;

import com.balkovskyy.rentagency.web.domain.Photo;


public interface PhotoService {
	List<Photo> findPhotoesByAdvertisementId(Long id);
	Photo getDefaultPhotoByAdvertisementId(Long id);
	Photo findPhotoById(Long id);
	Photo save(Photo photo);
	Photo updatePhoto(Photo photo);
	void deletePhoto(Long id);
}
