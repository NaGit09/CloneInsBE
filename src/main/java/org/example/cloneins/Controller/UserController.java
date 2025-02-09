package org.example.cloneins.Controller;

import org.example.cloneins.Entity.User;
import org.example.cloneins.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/User")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @GetMapping("/{UserID}")
    public User getUser(@PathVariable Long UserID) {
        return this.userRepository.findById(UserID).get() ;
    }
    @PostMapping
    public String addUser(@RequestBody User user) {
        return "Complete";
    }
}
