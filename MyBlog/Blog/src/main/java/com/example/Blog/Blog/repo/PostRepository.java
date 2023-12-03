package com.example.Blog.Blog.repo;

import com.example.Blog.Blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long> {

}
