package org.example.day_6_practice_one.service;

import org.example.day_6_practice_one.dto.CreatePostDTO;
import org.example.day_6_practice_one.dto.PostDTO;
import org.example.day_6_practice_one.entity.Post;

import java.util.List;

public interface PostService {

    PostDTO create(CreatePostDTO createPostDTO);
    PostDTO update(PostDTO postDTO, Long postId);
    PostDTO getPostById(Long postId);
    List<PostDTO> getAllPosts();
    void deletePostById(Long postId);
}
