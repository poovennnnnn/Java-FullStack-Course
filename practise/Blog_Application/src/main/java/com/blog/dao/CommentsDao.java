package com.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.dto.Comment;

public interface CommentsDao extends JpaRepository<Comment, Long> {

}
