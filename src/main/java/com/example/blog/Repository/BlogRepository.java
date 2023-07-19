package com.example.blog.Repository;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {
    @Query(value="SELECT b FROM Blog b WHERE (b.title like :search or b.author.name like :search)" )
    Page<Blog> SearchAll(String search, Pageable pageable);
}
