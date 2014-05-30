package com.balkovskyy.rentagency.web.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity(name = "Location")
@Table(name = "Locations")
public class Location implements Serializable, Identifiable<Long>{
	
	public Location() {
		
	}
	
	@Id
	@Column(name = "id_location")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_city", insertable = false, updatable = false)
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "id_region", insertable = false, updatable = false)
	private Region region;
	
	@Column(name = "longitude")
	private double longitude;
	
	@Column(name = "latitude")
	private double latitude;
	
	@Column(name = "friendly_name")
	private String friendlyName;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
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

	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
}
