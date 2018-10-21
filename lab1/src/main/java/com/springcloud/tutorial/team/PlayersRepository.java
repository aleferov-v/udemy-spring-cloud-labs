package com.springcloud.tutorial.team;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="players", rel="player")
public interface PlayersRepository extends CrudRepository<Player, Long> {

}
