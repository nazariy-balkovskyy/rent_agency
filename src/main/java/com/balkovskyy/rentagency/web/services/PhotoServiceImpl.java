package com.balkovskyy.rentagency.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.domain.Photo;
import com.balkovskyy.rentagency.web.repositories.PhotoRepository;

@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoRepository photoRepo;

	@Override
	public Photo findPhotoById(Long id) {
		return photoRepo.findOne(id);
	}

	@Override
	public Photo save(Photo photo) {
		return photoRepo.save(photo);
	}

	@Override
	public Photo updatePhoto(Photo photo) {
		// TODO Update fields checking
		return photoRepo.save(photo);	
	}

	@Override
	public void deletePhoto(Long id) {
		Photo photo = findPhotoById(id);
		photoRepo.delete(photo);
	}
}
