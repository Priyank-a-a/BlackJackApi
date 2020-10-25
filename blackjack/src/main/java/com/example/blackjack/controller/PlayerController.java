package com.example.blackjack.controller;

import com.example.blackjack.exception.RepoNotFound;
import com.example.blackjack.model.Player;
import com.example.blackjack.repo.PlayerRepo;
import jdk.management.resource.ResourceRequestDeniedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class PlayerController {

    @Autowired
    private PlayerRepo playerRepo;

    @GetMapping("/players")
    public List<Player> getAllPlayers()
    {
        return playerRepo.findAll();
    }

    //create  player rest api

    @PostMapping("/players")
    public Player createPlayer(@RequestBody Player player)
    {
        return playerRepo.save(player);
    }


    //get player by id api
    @GetMapping("/players/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable Long id)
    {
        Player player = playerRepo.findById(id).orElseThrow
                (()-> new RepoNotFound("Player not exists with id: "+id));

      return ResponseEntity.ok(player);
     }







}
