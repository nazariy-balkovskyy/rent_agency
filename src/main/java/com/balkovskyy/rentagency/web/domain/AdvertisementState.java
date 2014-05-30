package com.balkovskyy.rentagency.web.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity(name = "AdvertisementState")
@Table(name = "AdvertisementState")
public class AdvertisementState implements Serializable, Identifiable<Long>{
	
	public AdvertisementState() {
		
	}
	
	@Id
	@Column(name = "id_state")
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	
	@Column(name = "state_name")
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
