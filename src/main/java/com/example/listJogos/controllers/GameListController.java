package com.example.listJogos.controllers;

import com.example.listJogos.dto.GameDTO;
import com.example.listJogos.dto.GameListDTO;
import com.example.listJogos.dto.GameMinDTO;
import com.example.listJogos.service.GameListService;
import com.example.listJogos.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;


    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }
}
