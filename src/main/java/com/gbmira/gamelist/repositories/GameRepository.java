package com.gbmira.gamelist.repositories;

import com.gbmira.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

