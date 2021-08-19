package com.unosquare.tasklist.demo.entities.service;

import com.unosquare.tasklist.demo.entities.entity.User;

import java.util.List;

public interface IUserService {

    public List<User>findAll();
    public User save (User user);
    public User findById(Long id);
    public void delete(Long id);
}
