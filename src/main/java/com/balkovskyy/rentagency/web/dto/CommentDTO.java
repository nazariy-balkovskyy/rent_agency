package com.balkovskyy.rentagency.web.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentDTO {

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("user")
	private UserDTO user;
	
	@JsonProperty("mark")
	private MarkDTO mark;
	
	@JsonProperty("advertisement")
	private AdvertisementDTO advertisement;
	
	@JsonProperty("message")
	private String message;
	
	@JsonProperty("date")
	private Date date;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public MarkDTO getMark() {
		return mark;
	}

	public void setMark(MarkDTO mark) {
		this.mark = mark;
	}

	public AdvertisementDTO getAdvertisement() {
		return advertisement;
	}

	public void setAdvertisement(AdvertisementDTO advertisement) {
		this.advertisement = advertisement;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
