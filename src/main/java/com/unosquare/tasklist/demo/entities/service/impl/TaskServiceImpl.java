package com.unosquare.tasklist.demo.entities.service.impl;

import com.unosquare.tasklist.demo.entities.dao.ITaskDao;
import com.unosquare.tasklist.demo.entities.entity.Task;
import com.unosquare.tasklist.demo.entities.entity.User;
import com.unosquare.tasklist.demo.entities.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements ITaskService {

    @Autowired
    public ITaskDao taskDao;


    @Override
    public List<Task> findAll() {
        return (List<Task> ) taskDao.findAll();
    }

    @Override
    public Task save(Task task) {
        return taskDao.save(task);
    }

    @Override
    public Task findById(Long id) {

        Optional<Task> userExists = taskDao.findById(id);
        return userExists.isPresent() ? taskDao.findById(id).get():null;
    }

    @Override
    public void delete(Long id) {
        taskDao.deleteById(id);

    }
}
