package com.ticketing.ts.model;

import javax.persistence.*;

@Entity
@Table(name = "passengers")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "middle_name")
	private String middle_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "gender")
	private String gender;

	@Column(name = "age")
	private int age;

	@Column(name = "category")
	private String category;

	@Column(name = "disablity_status")
	private String disablity_status;

	@Column(name = "status")
	private boolean status;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Address address;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Identification identification;

	public Passenger() {
	}

	public Passenger(long id, String first_name, String middle_name, String last_name, String gender, int age,
			String category, String disablity_status, boolean status, Address address) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.gender = gender;
		this.age = age;
		this.category = category;
		this.disablity_status = disablity_status;
		this.status = status;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDisablity_status() {
		return disablity_status;
	}

	public void setDisablity_status(String disablity_status) {
		this.disablity_status = disablity_status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", first_name=" + first_name + ", middle_name=" + middle_name + ", last_name="
				+ last_name + ", gender=" + gender + ", age=" + age + ", category=" + category + ", disablity_status="
				+ disablity_status + ", status=" + status + ", address=" + address + "]";
	}

}
