package com.balkovskyy.rentagency.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.domain.User;
import com.balkovskyy.rentagency.web.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> getUsers() {
		return (List<User>) userRepo.findAll();
	}

}
