package com.example.teretana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.teretana.model.Post;
import com.example.teretana.service.PostService;

@RestController
@RequestMapping("/post")
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/add")
    public Post add(@RequestBody Post post) {
        return postService.savePost(post);
    }

    @GetMapping("/getAll")
    public List<Post> getAll() {
        return postService.getAllPosts();
    }

    @GetMapping("/getById")
    public Post getById(@RequestBody Integer id) {
        return postService.getPostById(id);
    }

    @PutMapping("/{id}/setClientToPost/{clientId}")
    public void setClientToPost(@PathVariable Integer id, @PathVariable Integer clientId) {
        postService.setClient(id, clientId);
    }
}