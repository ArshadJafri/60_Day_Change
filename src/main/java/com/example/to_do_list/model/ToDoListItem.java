package com.example.to_do_list.model;

import java.sql.Date;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ToDoListItem {

    private Long id;
    private String description;
        private Date timestamp;
        @NotBlank
        private String title;
        private Boolean completed;

    public ToDoListItem() {
    }

    public ToDoListItem(Long id, String description, Date timestamp, String title, Boolean completed) {
        this.id = id;
        this.description = description;
        this.timestamp = timestamp;
        this.title = title;
        this.completed = completed;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Boolean getCompleted() {
        return completed;
    }
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }


}
