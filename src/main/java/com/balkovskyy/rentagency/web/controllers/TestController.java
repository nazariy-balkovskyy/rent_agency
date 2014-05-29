package com.balkovskyy.rentagency.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.balkovskyy.rentagency.web.domain.User;
import com.balkovskyy.rentagency.web.dto.TestDTO;
import com.balkovskyy.rentagency.web.dto.UserDTO;
import com.balkovskyy.rentagency.web.dto.builders.UserDTOBuilder;
import com.balkovskyy.rentagency.web.repositories.UserRepository;

@Controller
@RequestMapping("/hello")
public class TestController {
	
	@Autowired
	private UserRepository repo;
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public TestDTO getName(@PathVariable String name){
		return new TestDTO(name);
	}
	
	@RequestMapping(value = "/{name}/get", method = RequestMethod.GET)
	public UserDTO getUserByName(@PathVariable String name){
		User u = repo.findOne(1L);
		return UserDTOBuilder.toUserDTO(u);
	}
}
