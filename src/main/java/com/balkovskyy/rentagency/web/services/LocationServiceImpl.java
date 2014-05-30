package com.balkovskyy.rentagency.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.domain.Location;
import com.balkovskyy.rentagency.web.repositories.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService{
	
	@Autowired
	private LocationRepository locationRepo;

	@Override
	public Location findLocationById(Long id) {
		return locationRepo.findOne(id);
	}

	@Override
	public Location save(Location location) {
		return locationRepo.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		// TODO Updating fields checking
		return locationRepo.save(location);
	}

	@Override
	public void deleteLocation(Long id) {
		Location location = findLocationById(id);
		locationRepo.delete(location);
	}
}
