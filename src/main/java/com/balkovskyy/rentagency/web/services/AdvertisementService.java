package com.balkovskyy.rentagency.web.services;

import com.balkovskyy.rentagency.web.domain.Advertisement;

public interface AdvertisementService {
	Advertisement findAdvertisementById(Long id);
	Advertisement save(Advertisement advertisement);
	Advertisement updateAdvertisement(Advertisement advertisement);
	void deleteAdvertisement(Long id);
}
