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
@Entity(name = "Advertisement")
@Table(name = "Advertisements")
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
	private FlatType type;
	
	@Column(name = "id_state")
	private Long stateId;
	
	@Column(name = "id_location")
	private Long locationId;
	
	@Column(name = "id_rent_type")
	private Long rentTypeId;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "views_count")
	private int viewsCount;
	
	@Column(name = "rooms_count")
	private int roomsCount;
	
	@Column(name = "floor_number")
	private int floorNumber;
	
	public Long getId(){
		return id;
	}
}
