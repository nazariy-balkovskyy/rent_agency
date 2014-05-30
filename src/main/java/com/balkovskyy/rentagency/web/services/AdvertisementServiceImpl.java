package com.balkovskyy.rentagency.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.domain.Advertisement;
import com.balkovskyy.rentagency.web.repositories.AdvertisementRepository;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {
	@Autowired
	private AdvertisementRepository advertisementRepo;

	@Override
	public Advertisement findAdvertisementById(Long id) {
		return advertisementRepo.findOne(id);
	}

	@Override
	public Advertisement save(Advertisement advertisement) {
		return advertisementRepo.save(advertisement);
	}

	@Override
	public Advertisement updateAdvertisement(Advertisement advertisement) {
		// TODO Add updating fields checking
		Advertisement adv = advertisementRepo.findOne(advertisement.getId());
		adv.setName(advertisement.getName());
		return advertisementRepo.save(advertisement);
	}

	@Override
	public void deleteAdvertisement(Long id) {
		Advertisement adv = advertisementRepo.findOne(id);
		advertisementRepo.delete(adv);
	}
}
