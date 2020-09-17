package com.project.ToDoList.Controllers;

import com.project.ToDoList.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

}
