package org.example.day_6_practice_one.repository;

import org.example.day_6_practice_one.dto.PostDTO;
import org.example.day_6_practice_one.dto.UserDTO;
import org.example.day_6_practice_one.entity.Post;
import org.example.day_6_practice_one.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
