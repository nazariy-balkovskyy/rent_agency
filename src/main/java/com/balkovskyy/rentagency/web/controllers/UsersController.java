package com.balkovskyy.rentagency.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.balkovskyy.rentagency.web.dto.UserDTO;
import com.balkovskyy.rentagency.web.dto.builders.UserDTOBuilder;
import com.balkovskyy.rentagency.web.services.UserService;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<UserDTO> getUsers(){
		return UserDTOBuilder.toUsersListDTO(userService.getUsers());
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public UserDTO addUser(@Valid @RequestBody UserDTO user){
		return user;
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public UserDTO updateUser(@Valid @RequestBody UserDTO user){
		return user;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteUser(@PathVariable Long id){
		
	}
}
