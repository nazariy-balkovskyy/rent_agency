package com.balkovskyy.rentagency.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkDTO {
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("user")
	private UserDTO user;
	
	@JsonProperty("advertisement")
	private AdvertisementDTO advertisement;
	
	@JsonProperty("value")
	private double value;

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

	public AdvertisementDTO getAdvertisement() {
		return advertisement;
	}

	public void setAdvertisement(AdvertisementDTO advertisement) {
		this.advertisement = advertisement;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
