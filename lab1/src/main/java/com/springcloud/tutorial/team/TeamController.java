package com.springcloud.tutorial.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	@GetMapping("/teams")
	public Iterable<Team> getAllTeams() {
		return teamRepository.findAll();
	}
		
	@GetMapping("/teams/{id}")
	public Team getTeamById(@PathVariable long id) {
		return teamRepository.findById(id).get();
	}
	
}
