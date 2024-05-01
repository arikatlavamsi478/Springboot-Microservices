package com.example.SpringRestApi.service.serviceImpl;

import com.example.SpringRestApi.entity.Post;
import com.example.SpringRestApi.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private IPostRepository postRepository;

    @Autowired
    public PostServiceImpl(IPostRepository postRepository) {

        this.postRepository = postRepository;
    }

    @Override
    public Post createAllPosts(Post post) {

        Post createdPost = postRepository.save(post);
        return createdPost;
    }

    @Override
    public List<Post> GetAllPosts() {

        return postRepository.findAll();
    }

    @Override
    public void DeletePostsById(Integer id) {
        postRepository.deleteById(id);
    }
}
