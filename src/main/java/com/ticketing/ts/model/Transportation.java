package com.ticketing.ts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transportations")
public class Transportation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "vehicle")
	private String vehicle;

	@Column(name = "plate_number")
	private String plate_number;

	@Column(name = "owner")
	private String owner;

	@Column(name = "numberOfSeat")
	private String numberOfSeat;

	public Transportation(long id, String vehicle, String plate_number, String owner, String numberOfSeat) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.plate_number = plate_number;
		this.owner = owner;
		this.numberOfSeat = numberOfSeat;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getPlate_number() {
		return plate_number;
	}

	public void setPlate_number(String plate_number) {
		this.plate_number = plate_number;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(String numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	@Override
	public String toString() {
		return "Transportation [id=" + id + ", vehicle=" + vehicle + ", plate_number=" + plate_number + ", owner="
				+ owner + ", numberOfSeat=" + numberOfSeat + "]";
	}

}
