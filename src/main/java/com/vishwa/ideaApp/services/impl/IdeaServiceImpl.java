package com.vishwa.ideaApp.services.impl;

import com.vishwa.ideaApp.daos.IdeaDao;
import com.vishwa.ideaApp.dtos.IdeaDTO;
import com.vishwa.ideaApp.entities.Idea;
import com.vishwa.ideaApp.services.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IdeaServiceImpl implements IdeaService {

    @Autowired
    private IdeaDao ideaDao;

    @Override
    public IdeaDTO saveIdea(IdeaDTO ideaDTO) {
        //convert DTO to Entity
        Idea idea = covertIdeaDTOtoEntity(ideaDTO);
        return convertIdeaEntityToDTO(ideaDao.save(idea));
    }

    private IdeaDTO convertIdeaEntityToDTO(Idea idea) {

        IdeaDTO ideaDTO = new IdeaDTO();
        ideaDTO.setId(idea.getId());
        ideaDTO.setIdeaTitle(idea.getIdeaTitle());
        ideaDTO.setDescription(idea.getDescription());
        ideaDTO.setAuthorName(idea.getAuthorName());
        return ideaDTO ;
    }

    private Idea covertIdeaDTOtoEntity(IdeaDTO ideaDTO) {
        Idea idea = new Idea();
        idea.setIdeaTitle(ideaDTO.getIdeaTitle());
        idea.setId(ideaDTO.getId());
        idea.setAuthorName(ideaDTO.getAuthorName());
        idea.setDescription(ideaDTO.getDescription());
        return idea ;
    }

    @Override
    public IdeaDTO updateIdea(IdeaDTO ideaDTO) {
        Idea idea = covertIdeaDTOtoEntity(ideaDTO);
        return convertIdeaEntityToDTO(ideaDao.save(idea));
    }

    @Override
    public List<IdeaDTO> getAllIdeas() {
        return ideaDao.getAllIdeas().stream().
                map(ideaEntity -> convertIdeaEntityToDTO(ideaEntity)).collect(Collectors.toList());
    }

    @Override
    public IdeaDTO getIdea(long id) {
        return convertIdeaEntityToDTO(ideaDao.findById(id));
    }

    @Override
    public void deleteIdea(long id) {
       ideaDao.delete(id);
    }
}
