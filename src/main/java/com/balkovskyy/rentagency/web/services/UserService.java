package com.balkovskyy.rentagency.web.services;

import java.util.List;

import com.balkovskyy.rentagency.web.domain.User;

public interface UserService {
	
	public List<User> getUsers();
	public User getUserById(Long id);
	public User saveUser(User user);
	public User updateUser(User user);
	public void removeUser(Long id);
	public boolean changePassword(User user, String newPassword);
}
