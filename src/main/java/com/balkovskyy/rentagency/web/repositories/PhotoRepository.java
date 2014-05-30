package com.balkovskyy.rentagency.web.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.balkovskyy.rentagency.web.domain.Photo;

@Repository
public interface PhotoRepository extends CrudRepository<Photo, Long>{

}
