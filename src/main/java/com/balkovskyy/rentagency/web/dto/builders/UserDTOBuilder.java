package com.balkovskyy.rentagency.web.dto.builders;

import java.util.ArrayList;
import java.util.List;

import com.balkovskyy.rentagency.web.domain.User;
import com.balkovskyy.rentagency.web.dto.UserDTO;

public class UserDTOBuilder {
	
	public static UserDTO toUserDTO(User user){
		UserDTO dto = new UserDTO();
		dto.setId(user.getId());
		dto.setFirstName(user.getFirstName());
		dto.setLastName(user.getLastName());
		dto.setPatronymic(user.getPatronymic());
		dto.setBirthDate(user.getBirthDate());
		dto.setEmail(user.getEmail());
		dto.setTelephone(user.getTelephone());
		dto.setPictureUrl(user.getPictureUrl());
		dto.setRegisterDate(user.getRegisterDate());
		return dto;
	}
	
	public static List<UserDTO> toUsersListDTO(List<User> users){
		List<UserDTO> usersList = new ArrayList<UserDTO>();
		for(User user:users){
			usersList.add(toUserDTO(user));
		}
		return usersList;
	}
}
