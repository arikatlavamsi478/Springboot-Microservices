package com.example.SpringRestApi.service.serviceImpl;

import com.example.SpringRestApi.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    public Post createAllPosts(Post post);
    List<Post> GetAllPosts();

    public void DeletePostsById(Integer id);

}
