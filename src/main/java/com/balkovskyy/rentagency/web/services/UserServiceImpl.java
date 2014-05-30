package com.balkovskyy.rentagency.web.services;

import java.util.List;

import liquibase.util.MD5Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Override
	public User getUserById(Long id) {
		return userRepo.findOne(id);
	}

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	@Modifying
    @Transactional
	@Override
	public User updateUser(User user) {
		User current = getUserById(user.getId());
		current.setFirstName(user.getFirstName());
		current.setLastName(user.getLastName());
		current.setPatronymic(user.getPatronymic());
		current.setTelephone(user.getTelephone());
		current.setPictureUrl(user.getPictureUrl());
		return userRepo.save(user);
	}

	@Override
	public void removeUser(Long id) {
		User user = getUserById(id);
		userRepo.delete(user);
	}

	@Override
	public boolean changePassword(User user, String newPassword) {
		if(newPassword.length() < 6 || newPassword.length() > 32){
			return false;
		}
		user.setPassword(MD5Util.computeMD5(newPassword));
		return false;
	}
}
