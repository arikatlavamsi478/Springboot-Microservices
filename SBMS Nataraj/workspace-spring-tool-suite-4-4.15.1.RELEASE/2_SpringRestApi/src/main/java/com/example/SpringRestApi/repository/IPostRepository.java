package com.example.SpringRestApi.repository;

import com.example.SpringRestApi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IPostRepository extends JpaRepository<Post, Integer> {

}
