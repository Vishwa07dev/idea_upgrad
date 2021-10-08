package com.vishwa.ideaApp.daos;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.vishwa.ideaApp.entities.Idea;

import java.util.List;

/**
 * Provide the facility to do CRUD operation
 * with DB
 */
public interface IdeaDao {

    /**
     * Save an idea
     */
    public Idea save(Idea idea);

    /**
     * Search for an idea
     */
    public Idea findById(long id);

    /**
     * Get all the ideas
     */
    public List<Idea> getAllIdeas();

    /**
     * Update the idea
     */
    public Idea udpateIdea(Idea idea);

    /**
     * Delete an idea
     */
    public void delete( long id);
}
