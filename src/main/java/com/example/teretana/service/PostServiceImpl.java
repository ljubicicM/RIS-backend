package com.example.teretana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teretana.model.Client;
import com.example.teretana.model.Post;
import com.example.teretana.repository.ClientRepository;
import com.example.teretana.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post getPostById(Integer id) {
        return postRepository.findById(id).get();
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public void setClient(Integer id, Integer clientId) {
        Post post = postRepository.findById(id).get();
        Client client = clientRepository.findById(clientId).get();
        post.setClient(client);
        postRepository.save(post);
    }
}
