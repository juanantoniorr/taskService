package com.unosquare.tasklist.demo.entities.dao;

import com.unosquare.tasklist.demo.entities.entity.User;
import org.springframework.data.repository.CrudRepository;

//Spring boot default implementation of CrudRepository
public interface IUserDao extends CrudRepository<User, Long> {

}
