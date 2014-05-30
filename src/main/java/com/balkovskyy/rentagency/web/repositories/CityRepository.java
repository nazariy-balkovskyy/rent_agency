package com.balkovskyy.rentagency.web.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.balkovskyy.rentagency.web.domain.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long>{

}
