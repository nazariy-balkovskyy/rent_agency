package com.balkovskyy.rentagency.web.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity(name = "Advertisement")
@Table(name = "RentAdvertisements")
public class Advertisement implements Serializable, Identifiable<Long>{
	
	public Advertisement() {
		
	}
	
	@Id
	@Column(name = "id_advertisement")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_user", insertable = false, updatable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "id_flat_type", insertable = false, updatable = false)
	private FlatType flatType;
	
	@ManyToOne
	@JoinColumn(name = "id_state", insertable = false, updatable = false)
	private AdvertisementState state;
	
	@ManyToOne
	@JoinColumn(name = "id_location", insertable = false, updatable = false)
	private Location location;
	
	@ManyToOne
	@JoinColumn(name = "id_rent_type", insertable = false, updatable = false)
	private RentType rentType;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "views_count")
	private int viewsCount;
	
	@Column(name = "rooms_count")
	private int roomsCount;
	
	@Column(name = "floor_number")
	private int floorNumber;
	
	@Column(name = "date")
	private Date date;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "advertisement", cascade = CascadeType.ALL)
	private List<Photo> photoes = new ArrayList<Photo>();
	
	@Transient
	private Photo photo;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public FlatType getFlatType() {
		return flatType;
	}

	public void setFlatType(FlatType flatType) {
		this.flatType = flatType;
	}

	public AdvertisementState getState() {
		return state;
	}

	public void setState(AdvertisementState state) {
		this.state = state;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public RentType getRentType() {
		return rentType;
	}

	public void setRentType(RentType rentType) {
		this.rentType = rentType;
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

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
