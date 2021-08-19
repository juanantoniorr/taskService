package com.unosquare.tasklist.demo.entities.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String description;
    private LocalDate creationDate;
    private LocalDate dueDate;
    private List<Category> categories;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public List<Category> getCatergories() {
        return categories;
    }

    public void setCatergories(List<Category> categories) {
        this.categories = categories;
    }
}
