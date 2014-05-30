package com.balkovskyy.rentagency.web.services;

import com.balkovskyy.rentagency.web.domain.Region;

public interface RegionService {
	Region findRegionById(Long id);
	Region save(Region region);
	Region updateRegion(Region region);
	void deleteRegion(Long id);
}
