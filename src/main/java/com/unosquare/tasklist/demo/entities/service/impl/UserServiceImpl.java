package com.unosquare.tasklist.demo.entities.service.impl;

import com.unosquare.tasklist.demo.entities.entity.User;
import com.unosquare.tasklist.demo.entities.dao.IUserDao;
import com.unosquare.tasklist.demo.entities.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    public IUserDao userDao;


    @Override
    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User findById(Long id) {
        Optional<User> userExists = userDao.findById(id);
        return userExists.isPresent() ? userDao.findById(id).get():null;
    }

    @Override
    public void delete(Long id) {
userDao.deleteById(id);
    }
}
