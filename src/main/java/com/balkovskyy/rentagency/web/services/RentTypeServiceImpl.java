package com.balkovskyy.rentagency.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.domain.RentType;
import com.balkovskyy.rentagency.web.repositories.RentTypeReopsitory;

@Service
public class RentTypeServiceImpl implements RentTypeService {

	@Autowired
	private RentTypeReopsitory typeReopsitory;
	
	@Override
	public List<RentType> getTypes() {
		return (List<RentType>) typeReopsitory.findAll();
	}

}
