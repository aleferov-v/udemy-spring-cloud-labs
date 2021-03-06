package com.springcloud.tutorial.team;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Team {

	@Id
	@GeneratedValue
	private long Id;
	private String name;
	private String location;
	private String mascot;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "teamId")
	private List<Player> players;
	
	public long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMascot() {
		return mascot;
	}

	public void setMascot(String mascot) {
		this.mascot = mascot;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	
	public List<Player> getPlayers() {
		return players;
	}
	
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}
