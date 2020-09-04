package com.ticketing.ts.model;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "paymentChannel")
	private String paymentChannel;

	@OneToOne(mappedBy = "payment")
	private Payment payment;
}
