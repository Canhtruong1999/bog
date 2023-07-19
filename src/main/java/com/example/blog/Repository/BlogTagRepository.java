package com.example.blog.Repository;

import com.example.blog.model.BlogTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogTagRepository extends JpaRepository<BlogTag,Integer> {
}
