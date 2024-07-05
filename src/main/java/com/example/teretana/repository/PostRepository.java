package com.example.teretana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teretana.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
