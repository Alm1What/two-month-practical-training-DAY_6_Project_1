package org.example.day_6_practice_one.service.serviceimpl;

import org.example.day_6_practice_one.dto.UserDTO;
import org.example.day_6_practice_one.entity.User;
import org.example.day_6_practice_one.mapper.UserMapper;
import org.example.day_6_practice_one.repository.UserRepository;
import org.example.day_6_practice_one.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository,
                           UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public void createUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("UserDTO is null");
        }

        userRepository.save(user);
    }

    @Override
    public Optional<UserDTO> getUserById(Long id) {
        if (!userRepository.existsById(id)) {
            throw new IllegalArgumentException("UserDTO not found");
        }
        return Optional.of(userMapper.toUserDTO(userRepository.findById(id).get()));
    }

    @Override
    public UserDTO deleteUserById(Long id) {
        return null;
    }

    @Override
    public UserDTO updateUser(Long id, User user) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() {

        return userRepository.findAll().stream().map(userMapper::toUserDTO).collect(Collectors.toList());
    }


}
