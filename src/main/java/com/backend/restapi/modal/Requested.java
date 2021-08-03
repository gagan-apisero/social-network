package com.backend.restapi.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "requested_table")
public class Requested {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;

	@Column(name = "user_id", nullable = false)
	private Integer userId;

	@Column(name = "requested_id", nullable = false)
	private Integer requestId;

	public Integer getRequestId() {
		return requestId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public Requested(int sno, Integer userId, Integer requestId) {
		super();
		this.sno = sno;
		this.userId = userId;
		this.requestId = requestId;
	}

	public Requested() {
		super();
	}

}
