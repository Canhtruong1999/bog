package com.example.blog.controller.api;

import com.example.blog.service.blog.BlogService;
import com.example.blog.service.blog.request.BlogSaveRequest;
import com.example.blog.service.blog.respone.BlogListRespone;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/blogs")
public class BlogRescontroller {
    private final BlogService blogService;

    public BlogRescontroller(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public Page<BlogListRespone> showSearch(@RequestParam(defaultValue = "") String search, Pageable pageable) {
        var a =blogService.searchAll(search,pageable);
        return blogService.searchAll(search,pageable);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid BlogSaveRequest request){
        blogService.create(request);
        return ResponseEntity.noContent().build();
    }
}
