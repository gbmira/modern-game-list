package com.gbmira.gamelist.controllers;

import com.gbmira.gamelist.entities.Game;
import com.gbmira.gamelist.entities.GameMinDTO;
import com.gbmira.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = service.findAll();
        return result;
    }
}
