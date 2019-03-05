package com.central.centraldocubo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cronometro {

	@Id
	private String code;
	private String user;
	private String time;
	
	
	public Cronometro() {
		super();
	}
	
	public Cronometro(String code, String user, String time) {
		super();
		this.code = code;
		this.user = user;
		this.time = time;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
