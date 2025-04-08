package org.example.day_6_practice_one.service;

import org.example.day_6_practice_one.dto.PostDTO;
import org.example.day_6_practice_one.dto.UserDTO;
import org.example.day_6_practice_one.entity.Post;
import org.example.day_6_practice_one.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void createUser(User user);
    Optional<UserDTO> getUserById(Long id);
    UserDTO deleteUserById(Long id);
    UserDTO updateUser(Long id, User user);
    List<UserDTO> getAllUsers();
    List<Post> getPostsByUserId(Long userId);

}
