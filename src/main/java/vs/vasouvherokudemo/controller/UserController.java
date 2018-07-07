package vs.vasouvherokudemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vs.vasouvherokudemo.entities.User;
import vs.vasouvherokudemo.repositories.UserRepository;

/**
 * UserController
 */
@RestController("users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public Iterable<User> users() {
        return repository.findAll();
    }

}