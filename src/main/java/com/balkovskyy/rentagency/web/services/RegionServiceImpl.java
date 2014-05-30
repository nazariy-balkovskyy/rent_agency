package com.balkovskyy.rentagency.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.repositories.RegionRepository;

@Service
public class RegionServiceImpl implements RegionService {

	@Autowired
	private RegionRepository regionRepo;
}
