package com.balkovskyy.rentagency.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.repositories.CityRepository;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityRepository cityRepo;
}
