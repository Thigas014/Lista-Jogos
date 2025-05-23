package com.example.listJogos.service;

import com.example.listJogos.dto.GameDTO;
import com.example.listJogos.dto.GameListDTO;
import com.example.listJogos.dto.GameMinDTO;
import com.example.listJogos.entities.Game;
import com.example.listJogos.entities.GameList;
import com.example.listJogos.repositories.GameListRepository;
import com.example.listJogos.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
