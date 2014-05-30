package com.balkovskyy.rentagency.web.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity(name = "Comment")
@Table(name = "Comments")
public class Comment implements Serializable, Identifiable<Long>{
	
	public Comment() {
		
	}
	
	@Id
	@Column(name="id_comment")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;
	
	@ManyToOne
	@JoinColumn(name = "id_mark", insertable = false, updatable = false)
	private Mark mark;
	
	@ManyToOne
	@JoinColumn(name = "id_advertisement", insertable = false, updatable = false)
	private Advertisement advertisement;
	
	@Column(name = "message")
	private String message;
	
	@Column(name = "date")
	private Date date;

	public Long getId() {
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

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public Advertisement getAdvertisement() {
		return advertisement;
	}

	public void setAdvertisement(Advertisement advertisement) {
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
