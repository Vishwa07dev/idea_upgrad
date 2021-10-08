package com.vishwa.ideaApp.services;

import com.vishwa.ideaApp.dtos.IdeaDTO;
import com.vishwa.ideaApp.entities.Idea;

import java.util.List;

public interface IdeaService {

    public IdeaDTO saveIdea(IdeaDTO ideaDTO);

    public IdeaDTO updateIdea(IdeaDTO ideaDTO);

    public List<IdeaDTO> getAllIdeas();

    public IdeaDTO getIdea(long id);

    public void deleteIdea(long id);
}
