package com.balkovskyy.rentagency.web.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.balkovskyy.rentagency.web.utils.JsonDateSerializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertisementDTO {
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("user")
	private UserDTO user;
	
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
	private String name;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("views_count")
	private int viewsCount;
	
	@JsonProperty("rooms_count")
	private int roomsCount;
	
	@JsonProperty("floor_number")
	private int floorNumber;
	
	@JsonProperty("photo")
	private String photo;
	
	@JsonProperty("date")
	@JsonSerialize(using = JsonDateSerializer.class)
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
