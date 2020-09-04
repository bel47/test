package com.ticketing.ts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "identifications")
public class Identification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "photo")
	private String photo;

	@Column(name = "attachment")
	private String attachment;

	@Column(name = "id_type")
	private String id_type;

	@Column(name = "id_number")
	private String id_number;
	@OneToOne(mappedBy = "identification")
	private Passenger passenger;

	public Identification(long id, String photo, String attachment, String id_type, String id_number) {
		super();
		this.id = id;
		this.photo = photo;
		this.attachment = attachment;
		this.id_type = id_type;
		this.id_number = id_number;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getId_type() {
		return id_type;
	}

	public void setId_type(String id_type) {
		this.id_type = id_type;
	}

	public String getId_number() {
		return id_number;
	}

	public void setId_number(String id_number) {
		this.id_number = id_number;
	}

	@Override
	public String toString() {
		return "Identification [id=" + id + ", photo=" + photo + ", attachment=" + attachment + ", id_type=" + id_type
				+ ", id_number=" + id_number + "]";
	}

}
