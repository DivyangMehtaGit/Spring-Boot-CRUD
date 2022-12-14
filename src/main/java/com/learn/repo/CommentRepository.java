package com.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
