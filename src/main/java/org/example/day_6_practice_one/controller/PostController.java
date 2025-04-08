package org.example.day_6_practice_one.controller;

import org.example.day_6_practice_one.dto.CreatePostDTO;
import org.example.day_6_practice_one.dto.PostDTO;
import org.example.day_6_practice_one.entity.Post;
import org.example.day_6_practice_one.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping()
    public PostDTO create(@RequestBody CreatePostDTO post) {
        return postService.create(post);
    }

    @PutMapping("/{postId}")
    public PostDTO update(@RequestBody PostDTO postDTO, @PathVariable Long postId) {
        return postService.update(postDTO, postId);
    }
}
