package com.example.demo.GameDemo;

import com.example.demo.BookDemo.BookController;
import jakarta.websocket.server.PathParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {

    final private GameRepository gameRepository;
    private static final Logger log = LoggerFactory.getLogger(GameController.class);


    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @GetMapping("/game/all")
    public List<Game> listGame() {
        log.info("listGame called");
        return gameRepository.findAll();
    }

    @GetMapping("/game/distinceGrades")
    public List<String> getAllGrades(){
        return gameRepository.getDistinctGrades();
    }


    @PostMapping("/game/add")
    public List<Game> addGame(@RequestBody Game game) {
        gameRepository.save(game);
        return gameRepository.findAll();
    }

    @PutMapping("/game/update")
    public List<Game> updateGame(@RequestBody Game game) {
        gameRepository.save(game);
        return gameRepository.findAll();
    }


    @GetMapping("/game/updateName/{oldName}/{newName}")
    public List<Game> updateGameName(@PathVariable String oldName, @PathVariable String newName) {
        gameRepository.updateGameName(oldName, newName);
        return gameRepository.findAll();
    }


}
