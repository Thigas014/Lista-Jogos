package com.example.listJogos.repositories;

import com.example.listJogos.entities.Game;
import com.example.listJogos.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
