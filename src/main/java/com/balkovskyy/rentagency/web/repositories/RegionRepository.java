package com.balkovskyy.rentagency.web.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.balkovskyy.rentagency.web.domain.Region;

@Repository
public interface RegionRepository extends CrudRepository<Region, Long>{

}
