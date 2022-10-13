package com.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.blog.dto.Post;

@Component
public interface PostDao extends JpaRepository<Post, Long> {

}
