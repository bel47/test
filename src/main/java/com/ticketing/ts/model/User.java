package com.ticketing.ts.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "uname")
	private String userName;

	@Column(name = "password")
	private String password;
}
