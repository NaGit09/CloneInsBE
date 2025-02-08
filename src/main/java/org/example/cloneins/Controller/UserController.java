package org.example.cloneins.Controller;

import org.example.cloneins.Entity.User;
import org.example.cloneins.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/User")
public class UserController {
private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping
    public String getAllUsers() {
        return "userRepository.findAll().toString()";
    }
}
