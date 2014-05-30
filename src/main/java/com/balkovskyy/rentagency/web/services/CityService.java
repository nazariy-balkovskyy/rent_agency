package com.balkovskyy.rentagency.web.services;

import com.balkovskyy.rentagency.web.domain.City;

public interface CityService {
	City findCityById(Long id);
	City save(City city);
	City updateCity(City city);
	void deleteCity(Long id);
}
