package com.example.SpringRestApi.dto;

import lombok.Data;

@Data
public class PostRequest {
    private Integer id;
    private String title;
    private String description;
    private String content;
}
