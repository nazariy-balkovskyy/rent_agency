package com.balkovskyy.rentagency.web.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.balkovskyy.rentagency.web.domain.Photo;

@Repository
public interface PhotoRepository extends CrudRepository<Photo, Long>{

	@Query("SELECT p FROM Photo p WHERE p.advertisement.id = :id")
	public List<Photo> getPhotoByAdvertisementId(@Param("id")Long id);
	
	@Query("SELECT p FROM Photo p WHERE p.advertisement.id = :id AND p.isDefault = 1")
	public Photo getDefaultPhotoByAdvertisementId(@Param("id")Long id);
}
