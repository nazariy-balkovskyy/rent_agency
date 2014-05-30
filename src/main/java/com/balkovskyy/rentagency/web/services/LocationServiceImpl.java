package com.balkovskyy.rentagency.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.repositories.LocationRepository;

@Service
public class LocationServiceImpl {
	
	@Autowired
	private LocationRepository locationRepo;
}
