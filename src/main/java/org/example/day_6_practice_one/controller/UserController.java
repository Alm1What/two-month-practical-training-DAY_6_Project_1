package org.example.day_6_practice_one.controller;

import org.example.day_6_practice_one.dto.PostDTO;
import org.example.day_6_practice_one.dto.UserDTO;
import org.example.day_6_practice_one.entity.Post;
import org.example.day_6_practice_one.entity.User;
import org.example.day_6_practice_one.service.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping()
    public String createUser(@RequestBody User user) {
        return String.format("Ok");
    }

    @GetMapping()
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<UserDTO> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
    }

    @GetMapping("/getAllPost/{userId}")
    public List<Post> getAllPostsByUserId(@PathVariable Long userId) {
        return userService.getPostsByUserId(userId);
    }
}
