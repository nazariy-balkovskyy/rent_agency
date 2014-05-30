package com.balkovskyy.rentagency.web.services;

import com.balkovskyy.rentagency.web.domain.Location;

public interface LocationService {
	Location findLocationById(Long id);
	Location save(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Long id);
}
