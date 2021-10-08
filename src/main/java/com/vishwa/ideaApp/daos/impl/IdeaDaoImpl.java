package com.vishwa.ideaApp.daos.impl;

import com.vishwa.ideaApp.daos.IdeaDao;
import com.vishwa.ideaApp.entities.Idea;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Repository
public class IdeaDaoImpl implements IdeaDao {

    // Local in-memory data store
    private static final Map<Long, Idea> IDEA_STORE = new ConcurrentHashMap<>();

    @Override
    public Idea save(Idea idea) {
        IDEA_STORE.put(idea.getId(), idea);
        return idea;
    }

    @Override
    public Idea findById(long id) {
        return IDEA_STORE.get(id);
    }

    @Override
    public List<Idea> getAllIdeas() {
        return IDEA_STORE.values().stream().collect(Collectors.toList());
    }

    @Override
    public Idea udpateIdea(Idea idea) {
        IDEA_STORE.put(idea.getId(), idea);
        return idea;
    }

    @Override
    public void delete(long id) {
      IDEA_STORE.remove(id);
    }
}
