package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "app")
public class SongController {

    @Autowired
    private SongRepository songRepository;

    @GetMapping
    private List<Song> getAll(){
        return this.songRepository.findAll();
    }

    @GetMapping("/song/{id}")
    private Song tById(@PathVariable Long id){
        return this.songRepository.findById(id).orElse(new Song("Nothing"));
    }
}
