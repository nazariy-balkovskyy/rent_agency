package com.balkovskyy.rentagency.web.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.balkovskyy.rentagency.web.domain.Advertisement;

@Repository
public interface AdvertisementRepository extends CrudRepository<Advertisement, Long>{
	
	@Query("SELECT a FROM Advertisement a WHERE a.location.city.id = :id")
	public List<Advertisement> getAdvetisementsByCity(@Param("id")Long cityId);
	
	@Query("SELECT a FROM Advertisement a WHERE a.location.region.id = :id")
	public List<Advertisement> getAdvetisementsByCityRegion(@Param("id")Long regionId);
	
	@Query("SELECT a FROM Advertisement a WHERE a.rentType.id = :id")
	public List<Advertisement> getAdvetisementsByRentType(@Param("id")Long typeId);
	
	@Query("SELECT a FROM Advertisement a WHERE a.location.region.id = :id AND a.rentType.id = :tid")
	public List<Advertisement> getAdvetisementsByRegionWithType(@Param("id")Long regionId, @Param("tid")Long typeId);
}
