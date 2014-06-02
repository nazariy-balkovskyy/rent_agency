package com.balkovskyy.rentagency.web.services;

import java.util.List;

import com.balkovskyy.rentagency.web.domain.City;

public interface CityService {
	List<City> findAllCities();
	City findCityById(Long id);
	City save(City city);
	City updateCity(City city);
	void deleteCity(Long id);
}
