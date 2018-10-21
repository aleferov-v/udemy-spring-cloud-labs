package com.springcloud.tutorial.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@RestController
public class PlayerController {

	@Autowired
	PlayersRepository repo;
	
	@GetMapping("/players")
	public Iterable<Player> getAllPlayers() {
		return repo.findAll(); 
	}

	@GetMapping("/players/{id}")
	public Player getPlayerById(@PathVariable long id) {
		return repo.findById(id).get(); 
	}
	
	
}
