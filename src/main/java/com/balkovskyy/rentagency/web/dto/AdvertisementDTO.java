package com.balkovskyy.rentagency.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertisementDTO {
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("user")
	private UserDTO use;
	
	@JsonProperty("flat_type")
	private FlatTypeDTO flatType;
	
	@JsonProperty("state")
	private AdvertisementStateDTO state;
	
	@JsonProperty("rent_type")
	private RentTypeDTO rentType;
	
	@JsonProperty("location")
	private LocationDTO location;
	
	@JsonProperty("price")
	private double price;
	
	@JsonProperty("name")
	private double name;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("views_count")
	private int viewsCount;
	
	@JsonProperty("rooms_count")
	private int roomsCount;
	
	@JsonProperty("floor_number")
	private int floorNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDTO getUse() {
		return use;
	}

	public void setUse(UserDTO use) {
		this.use = use;
	}

	public FlatTypeDTO getFlatType() {
		return flatType;
	}

	public void setFlatType(FlatTypeDTO flatType) {
		this.flatType = flatType;
	}

	public AdvertisementStateDTO getState() {
		return state;
	}

	public void setState(AdvertisementStateDTO state) {
		this.state = state;
	}

	public RentTypeDTO getRentType() {
		return rentType;
	}

	public void setRentType(RentTypeDTO rentType) {
		this.rentType = rentType;
	}

	public LocationDTO getLocation() {
		return location;
	}

	public void setLocation(LocationDTO location) {
		this.location = location;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getName() {
		return name;
	}

	public void setName(double name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getViewsCount() {
		return viewsCount;
	}

	public void setViewsCount(int viewsCount) {
		this.viewsCount = viewsCount;
	}

	public int getRoomsCount() {
		return roomsCount;
	}

	public void setRoomsCount(int roomsCount) {
		this.roomsCount = roomsCount;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
}
