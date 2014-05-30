package com.balkovskyy.rentagency.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.repositories.MarkRepository;

@Service
public class MarkServiceImpl implements MarkService{

	@Autowired
	private MarkRepository markRepo;
}
