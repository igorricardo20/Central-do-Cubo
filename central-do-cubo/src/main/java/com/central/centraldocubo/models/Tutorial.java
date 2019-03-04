package com.central.centraldocubo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Tutorial implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int code;
	
	private String name;
	private String description;
	private String dificulty;
	private String link;
	
	public Tutorial() {
		super();
	}
	
	public Tutorial(int code, String name, String description, String dificulty, String link) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.dificulty = dificulty;
		this.link = link;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDificulty() {
		return dificulty;
	}

	public void setDificulty(String dificulty) {
		this.dificulty = dificulty;
	}
	
	
	
}
