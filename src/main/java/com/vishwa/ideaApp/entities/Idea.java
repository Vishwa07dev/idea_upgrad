package com.vishwa.ideaApp.entities;

import java.util.Objects;

/**
 * This class will be used to store
 * the idea data in Dara Storage Layer
 */
public class Idea {
    private long id;
    private String ideaTitle;
    private String description;
    private String authorName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIdeaTitle() {
        return ideaTitle;
    }

    public void setIdeaTitle(String ideaTitle) {
        this.ideaTitle = ideaTitle;
    }

    @Override
    public String toString() {
        return "Idea{" +
                "id=" + id +
                ", ideaTitle='" + ideaTitle + '\'' +
                ", description='" + description + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Idea idea = (Idea) o;
        return id == idea.id && Objects.equals(ideaTitle, idea.ideaTitle) && Objects.equals(description, idea.description) && Objects.equals(authorName, idea.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ideaTitle, description, authorName);
    }
}
