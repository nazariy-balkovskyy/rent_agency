package com.balkovskyy.rentagency.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.domain.City;
import com.balkovskyy.rentagency.web.repositories.CityRepository;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityRepository cityRepo;

	@Override
	public City findCityById(Long id) {
		return cityRepo.findOne(id);
	}

	@Override
	public City save(City city) {
		return cityRepo.save(city);
	}

	@Override
	public City updateCity(City city) {
		// TODO Add fields checking
		return cityRepo.save(city);
	}

	@Override
	public void deleteCity(Long id) {
		City city = cityRepo.findOne(id);
		cityRepo.delete(city);
	}

	@Override
	public List<City> findAllCities() {
		return (List<City>) cityRepo.findAll();
	}
}
