package com.vishwa.ideaApp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This class with be used for
 * the interconversion with JSON
 */
public class IdeaDTO {

    private long id;
    @JsonProperty("idea_title")
    private String ideaTitle;
    private String description;
    @JsonProperty("author_name")
    private String authorName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdeaTitle() {
        return ideaTitle;
    }

    public void setIdeaTitle(String ideaTitle) {
        this.ideaTitle = ideaTitle;
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

    @Override
    public String toString() {
        return "IdeaDTO{" +
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
        IdeaDTO ideaDTO = (IdeaDTO) o;
        return id == ideaDTO.id && Objects.equals(ideaTitle, ideaDTO.ideaTitle) && Objects.equals(description, ideaDTO.description) && Objects.equals(authorName, ideaDTO.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ideaTitle, description, authorName);
    }
}
