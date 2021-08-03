package com.backend.restapi.modal;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accepted_table")
public class AcceptedTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	@Column(name="userId",nullable=false)
	private int userId;
	
	@Column(name="acceptedId")
	private int acceptedId;
	
	public AcceptedTable()
	{
		super();
	}
	
	public AcceptedTable(int sno,int userId,int acceptedId)
	{
		super();
		this.sno=sno;
		this.userId=userId;
		this.acceptedId=acceptedId;
	}

	public int getUser_id() {
		return userId;
	}

	public void setUser_id(int userId) {
		this.userId = userId;
	}

	public int getAccepted_id() {
		return acceptedId;
	}

	public void setAccepted_id(int acceptedId) {
		this.acceptedId = acceptedId;
	}
	
}
