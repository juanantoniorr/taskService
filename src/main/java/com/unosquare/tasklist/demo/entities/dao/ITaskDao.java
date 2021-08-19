package com.unosquare.tasklist.demo.entities.dao;

import com.unosquare.tasklist.demo.entities.entity.Task;
import org.springframework.data.repository.CrudRepository;

//Spring boot default implementation of CrudRepository
public interface ITaskDao extends CrudRepository<Task, Long> {

}
