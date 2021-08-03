package com.backend.restapi.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="fname", nullable=false, length=50)
	private String fname;
	
	@Column(name="lname", nullable=false, length=50)
	private String lname;
	
	@Column(name="email", nullable=false, unique = true, length=50)	
	private String email;
	
	@Column(name="username", nullable=false, unique=true, length=50)	
	private String username;
	
	@Column(name="pass", nullable=false, length = 50)	
	private String pass;
	
	@Column(name="intro")
	private String intro;
	
	@Column(name="role", nullable=false, columnDefinition="text default 'user'")
	private String role;
	
	

	public Users() {
		super();
	}

	public Users(Integer id, String fname, String lname, String email, String username, String pass, String intro,
			String role) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.username = username;
		this.pass = pass;
		this.intro = intro;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}
