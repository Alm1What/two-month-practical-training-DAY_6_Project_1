package org.example.day_6_practice_one.service;

import org.example.day_6_practice_one.dto.CreatePostDTO;
import org.example.day_6_practice_one.dto.PostDTO;
import org.example.day_6_practice_one.entity.Post;

public interface PostService {

    PostDTO create(CreatePostDTO createPostDTO);
    PostDTO update(PostDTO postDTO, Long postId);
}
