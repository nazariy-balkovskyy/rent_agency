package com.balkovskyy.rentagency.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.domain.Region;
import com.balkovskyy.rentagency.web.repositories.RegionRepository;

@Service
public class RegionServiceImpl implements RegionService {

	@Autowired
	private RegionRepository regionRepo;

	@Override
	public Region findRegionById(Long id) {
		return regionRepo.findOne(id);
	}

	@Override
	public Region save(Region region) {
		return regionRepo.save(region);
	}

	@Override
	public Region updateRegion(Region region) {
		// TODO Updating fields checking
		return regionRepo.save(region);
	}

	@Override
	public void deleteRegion(Long id) {
		Region region = findRegionById(id);
		regionRepo.delete(region);
	}
}
