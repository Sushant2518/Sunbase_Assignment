package com.sunbase.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uuid;
    @NotEmpty(message = "first name should be not Empty")
    @NotNull
    @JsonProperty("first_name")
    private String firstName;
    @NotNull
    @NotEmpty(message = "Last name should be not Empty")
    @JsonProperty("last_name")
    private String lastName;
    @NotNull
    @NotEmpty(message = "Last name should be not Empty")
    private String street;
    @NotNull
    @NotEmpty(message = "Last name should be not Empty")
    private String address;
    @NotNull
    @NotEmpty(message = "Last name should be not Empty")
    private String city;
    @NotNull
    @NotEmpty(message = "Last name should be not Empty")
    private String state;
   @Email(message = "please write email format")
    private String email;
    @NotNull
    @NotEmpty(message = "Last name should be not Empty")
    private String phone;
    
    
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(Long id, String uuid,
			@NotEmpty(message = "first name should be not Empty") @NotNull String firstName,
			@NotNull @NotEmpty(message = "Last name should be not Empty") String lastName,
			@NotNull @NotEmpty(message = "Last name should be not Empty") String street,
			@NotNull @NotEmpty(message = "Last name should be not Empty") String address,
			@NotNull @NotEmpty(message = "Last name should be not Empty") String city,
			@NotNull @NotEmpty(message = "Last name should be not Empty") String state,
			@Email(message = "please write email format") String email,
			@NotNull @NotEmpty(message = "Last name should be not Empty") String phone) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phone = phone;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUuid() {
		return uuid;
	}


	public void setUuid(String uuid) {
		this.uuid = uuid;
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


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    
    
}
