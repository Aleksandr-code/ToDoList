package com.project.ToDoList;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<User, Integer> {

}
