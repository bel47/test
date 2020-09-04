package com.ticketing.ts.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "ticket_number")
	private String ticket_number;

	@Column(name = "expriry_date")
	private Date expiry_date;

	@Column(name = "issue_date")
	private Date issue_date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTicket_number() {
		return ticket_number;
	}

	public void setTicket_number(String ticket_number) {
		this.ticket_number = ticket_number;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", ticket_number=" + ticket_number + ", expiry_date=" + expiry_date
				+ ", issue_date=" + issue_date + "]";
	}

}
