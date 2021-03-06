package com.unosquare.tasklist.demo.entities.entity;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private List<Task> tasks;

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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
