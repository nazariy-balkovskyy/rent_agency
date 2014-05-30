package com.balkovskyy.rentagency.web.services;

import com.balkovskyy.rentagency.web.domain.Photo;


public interface PhotoService {
	Photo findPhotoById(Long id);
	Photo save(Photo photo);
	Photo updatePhoto(Photo photo);
	void deletePhoto(Long id);
}
