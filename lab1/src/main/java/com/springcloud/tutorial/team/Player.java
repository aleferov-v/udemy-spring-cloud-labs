package com.springcloud.tutorial.team;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

@Entity
public class Player {

	@javax.persistence.Id
	@GeneratedValue
	private long Id;

	private String name;

	private String position;

	public Player() {
	}

	public long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
