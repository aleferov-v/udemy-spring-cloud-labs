package com.springcloud.tutorial;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springcloud.tutorial.team.Player;
import com.springcloud.tutorial.team.PlayersRepository;
import com.springcloud.tutorial.team.Team;
import com.springcloud.tutorial.team.TeamRepository;

@SpringBootApplication
public class Lab1Application {

	@Autowired
	private PlayersRepository playersRepo;
	
	@Autowired
	private TeamRepository teamRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}
	
	@PostConstruct
	public void init() {
		List<Player> players = getPlayers();
		
		Team t1 = new Team();
		t1.setName("Team 1");
		t1.setMascot("Mascot 1");
		t1.setLocation("Harlem");
		t1.setPlayers(players);

		Team t2 = new Team();
		t2.setName("Team 2");
		t2.setMascot("Mascot 2");
		t2.setLocation("New York");

		teamRepo.save(t1);
		teamRepo.save(t2);
	}

	private List<Player> getPlayers() {
		List<Player> players = new ArrayList<>();
		
		Player p1 = new Player();
		p1.setName("Player 1");
		p1.setPosition("catcher");

		Player p2 = new Player();
		p2.setName("Player 2");
		p2.setPosition("quoter");
		
		players.add(p1);
		players.add(p2);
		
		playersRepo.saveAll(players);
		
		return players;
	}
}
