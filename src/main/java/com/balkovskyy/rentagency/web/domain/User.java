package com.balkovskyy.rentagency.web.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity(name="User")
@Table(name="Users")
public class User implements Serializable, Identifiable<Long>{
	@Id
	@Column(nullable = false, name = "id_user")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "first_name", length = 55, nullable = false)
	private String firstName;

	@Column(name = "last_name", length = 55, nullable = false)
	private String lastName;
	
	@Column(name = "patronymic", length = 55, nullable = true)
	private String patronymic;
	
	@Column(name = "birthdate", nullable = true)
	private Date birthDate;
	
	@Column(name = "email", length = 255, nullable = false)
	private String email;
	
	@Column(name = "password", length = 32, nullable = false)
	private String password;
	
	@Column(name = "telephone", length = 13, nullable = false)
	private String telephone;
	
	@Column(name = "picture", length = 255, nullable = false)
	private String pictureUrl;
	
	@Column(name = "register_date", nullable = true)
	private Date registerDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public User(Long id, String firstName, String lastName, String patronymic,
			Date birthDate, String email, String password, String telephone,
			String pictureUrl, Date registerDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.patronymic = patronymic;
		this.birthDate = birthDate;
		this.email = email;
		this.password = password;
		this.telephone = telephone;
		this.pictureUrl = pictureUrl;
		this.registerDate = registerDate;
	}
}
