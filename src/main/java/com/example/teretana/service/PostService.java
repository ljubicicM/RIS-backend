package com.example.teretana.service;

import java.util.List;

import com.example.teretana.model.Post;

public interface PostService {

    public Post savePost(Post post);

    public Post getPostById(Integer id);

    public List<Post> getAllPosts();

    public void setClient(Integer id, Integer clientId);
}
