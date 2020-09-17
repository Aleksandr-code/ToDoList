package com.project.ToDoList.Controllers;

import com.project.ToDoList.Repositories.UserRepository;
import com.project.ToDoList.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;

import static java.lang.System.*;


@RestController
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    String addNewUser (@RequestParam String login, @RequestParam String password
            , @RequestParam String email ) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setEmail(email);
        user.setCreated_at(new Timestamp(currentTimeMillis()));
        userRepository.save(user);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll() ;
    }

    @GetMapping("/")
    String index(){
        return "Hello world";
    }
}
