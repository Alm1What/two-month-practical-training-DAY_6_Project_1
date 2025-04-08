package org.example.day_6_practice_one.mapper;

import org.example.day_6_practice_one.dto.PostDTO;
import org.example.day_6_practice_one.entity.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostDTO toDTO(Post post);
}
