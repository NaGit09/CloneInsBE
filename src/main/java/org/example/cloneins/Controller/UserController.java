package org.example.cloneins.Controller;

import org.example.cloneins.Entity.Users;
import org.example.cloneins.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/User")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/All")
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
    @GetMapping(path = "/{UserID}")
    public Users getUser(@PathVariable Long UserID) {
        return this.userRepository.findById(UserID).orElse(null);
    }
    @PostMapping
    public String addUser(@RequestBody Users user) {
        userRepository.save(user);
        return "Complete";
    }
}
