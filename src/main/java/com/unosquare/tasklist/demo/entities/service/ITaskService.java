package com.unosquare.tasklist.demo.entities.service;


import com.unosquare.tasklist.demo.entities.entity.Task;

import java.util.List;

public interface ITaskService {

        public List<Task> findAll();
        public Task save (Task task);
        public Task findById(Long id);
        public void delete(Long id);

}
