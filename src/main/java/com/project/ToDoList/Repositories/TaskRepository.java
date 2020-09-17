package com.project.ToDoList.Repositories;

import com.project.ToDoList.User;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<User, Integer> {

}
