package com.vishwa.ideaApp.controllers;

import com.vishwa.ideaApp.dtos.IdeaDTO;
import com.vishwa.ideaApp.services.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ideas")
public class IdeaController {

    @Autowired
    private IdeaService ideaService;

    /**
     * Expose an endpoint for creating idea
     * POST 127.0.0.1:8080/ideaApp/v1/ideas
     *
     * JSON request body
     */
    @PostMapping
    public ResponseEntity createIdea(@RequestBody IdeaDTO ideaDTO){

        return new ResponseEntity(ideaService.saveIdea(ideaDTO), HttpStatus.CREATED);
    }

    /**
     * Get the list of all the ideas created
     */

    @GetMapping
    public ResponseEntity getAllIdeas(){
        return new ResponseEntity(ideaService.getAllIdeas(), HttpStatus.OK);
    }

    /**
     * Get an idea based on id
     */


    /**
     * Update an idea
     */


    /**
     * delete an ideas
     */
}
