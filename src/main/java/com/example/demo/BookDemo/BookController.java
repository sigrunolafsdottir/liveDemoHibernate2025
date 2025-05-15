package com.example.demo.GameDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    final private GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @GetMapping("/game/all")
    public List<Game> listGame() {
        return gameRepository.findAll();
    }


    @PostMapping("/game/add")
    public List<Game> addGame(@RequestBody Game game) {
        gameRepository.save(game);
        return gameRepository.findAll();
    }


}
