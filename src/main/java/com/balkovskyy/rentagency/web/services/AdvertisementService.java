package com.balkovskyy.rentagency.web.services;

import java.util.List;

import com.balkovskyy.rentagency.web.domain.Advertisement;

public interface AdvertisementService {
	List<Advertisement> findAdvertisementsByCity(Long cityId);
	List<Advertisement> findAdvertisementsByRentType(Long rentTypeId);
	List<Advertisement> findAdvertisementsByCityRegion(Long regionId);
	List<Advertisement> findAdvertisementsByCityRegionWithType(Long regionId, Long typeId);
	List<Advertisement> findAllAdvertisements();
	Advertisement findAdvertisementById(Long id);
	Advertisement save(Advertisement advertisement);
	Advertisement updateAdvertisement(Advertisement advertisement);
	void deleteAdvertisement(Long id);
}
