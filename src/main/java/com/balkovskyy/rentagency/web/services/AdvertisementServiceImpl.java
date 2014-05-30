package com.balkovskyy.rentagency.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.repositories.AdvertisementRepository;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {
	@Autowired
	private AdvertisementRepository advertisementRepo;
}
