package org.example.day_6_practice_one.mapper;

import org.example.day_6_practice_one.dto.UserDTO;
import org.example.day_6_practice_one.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toUserDTO(User user);
    User toUser(UserDTO userDTO);
}
