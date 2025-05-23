package org.example.day_6_practice_one.dto;

import lombok.Data;

import java.util.List;

public class UserDTO {

    private Long id;

    private String username;
    private String email;
    private List<PostDTO> posts;

    public UserDTO() {
    }

    public UserDTO(Long id, String username, String email, List<PostDTO> posts) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.posts = posts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PostDTO> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDTO> posts) {
        this.posts = posts;
    }
}
