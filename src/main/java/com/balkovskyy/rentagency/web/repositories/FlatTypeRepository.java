package com.balkovskyy.rentagency.web.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.balkovskyy.rentagency.web.domain.FlatType;

@Repository
public interface FlatTypeRepository extends CrudRepository<FlatType, Long>{

}
