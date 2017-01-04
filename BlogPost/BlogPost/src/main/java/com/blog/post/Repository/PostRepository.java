package com.blog.post.Repository;

import org.springframework.data.repository.CrudRepository;

import com.blog.post.Domain.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

}
