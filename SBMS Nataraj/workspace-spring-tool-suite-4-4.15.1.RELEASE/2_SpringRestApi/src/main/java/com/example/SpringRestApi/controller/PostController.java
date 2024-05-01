package com.example.SpringRestApi.controller;

import com.example.SpringRestApi.entity.Post;
import com.example.SpringRestApi.service.serviceImpl.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/posts")
public class PostController {

    private PostService postService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PostController.class);

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping()
    public ResponseEntity<Post> createPosts(@RequestBody Post post) {
        return new ResponseEntity<>(postService.createAllPosts(post), HttpStatus.CREATED);
    }

    @GetMapping()
   // @Cacheable("Post-Cache")
   // @Transactional(readOnly = true)
    public ResponseEntity<List<Post>> getPosts() {
        LOGGER.info("Find All posts" );
        return new ResponseEntity<>(postService.GetAllPosts(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePostById(@PathVariable("id") Integer id) {
        try {
            postService.DeletePostsById(id);
            return ResponseEntity.ok("Post deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting post.");
        }
    }
}
