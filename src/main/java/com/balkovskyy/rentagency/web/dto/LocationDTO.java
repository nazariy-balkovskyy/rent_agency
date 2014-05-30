package com.balkovskyy.rentagency.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationDTO {
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("longitude")
	private double longitude;
	
	@JsonProperty("latitude")
	private double latitude;
	
	@JsonProperty("city")
	private CityDTO city;
	
	@JsonProperty("region")
	private RegionDTO region;
	
	@JsonProperty("friendly_name")
	private String friendlyName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public CityDTO getCity() {
		return city;
	}

	public void setCity(CityDTO city) {
		this.city = city;
	}

	public RegionDTO getRegion() {
		return region;
	}

	public void setRegion(RegionDTO region) {
		this.region = region;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
}
