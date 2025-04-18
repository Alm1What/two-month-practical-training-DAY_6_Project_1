package org.example.day_6_practice_one.service.serviceimpl;

import org.example.day_6_practice_one.dto.CreatePostDTO;
import org.example.day_6_practice_one.dto.PostDTO;
import org.example.day_6_practice_one.entity.Post;
import org.example.day_6_practice_one.entity.User;
import org.example.day_6_practice_one.mapper.PostMapper;
import org.example.day_6_practice_one.repository.PostRepository;
import org.example.day_6_practice_one.repository.UserRepository;
import org.example.day_6_practice_one.service.PostService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;
    private final UserRepository userRepository;

    public PostServiceImpl(PostRepository postRepository, PostMapper postMapper,
                           UserRepository userRepository) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
        this.userRepository = userRepository;
    }

    @Override
    public PostDTO create(CreatePostDTO createPostDTO) {
        User user = userRepository.findById(createPostDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Post post = new Post();
        post.setTitle(createPostDTO.getTitle());
        post.setContent(createPostDTO.getContent());
        post.setCreateTime(LocalDateTime.now());
        post.setUser(user);
        postRepository.save(post);
        return postMapper.toDTO(post);
    }

    @Override
    public PostDTO update(PostDTO postDTO, Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found"));

        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());
        postRepository.save(post);
        return postMapper.toDTO(post);
    }

    @Override
    public PostDTO getPostById(Long postId) {
        if (postRepository.findById(postId).isPresent()) {
            return postMapper.toDTO(postRepository.findById(postId).get());
        } else {
            throw new RuntimeException("Post not found");
        }
    }

    @Override
    public List<PostDTO> getAllPosts() {
        return postRepository.findAll().stream().map(postMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public void deletePostById(Long postId) {
        postRepository.deleteById(postId);
    }



}
