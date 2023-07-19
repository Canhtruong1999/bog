package com.example.blog.controller.thymleaf;

import com.example.blog.model.Blog;
import com.example.blog.service.blog.BlogService;
import com.example.blog.service.blog.request.BlogSaveRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/blogs")

public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public String listAPI(@RequestParam(defaultValue = "") String search,  @PageableDefault(size = 5) Pageable pageable, Model model) {

        return "index";
    }
//    @GetMapping("/create")
//    public String showCreate(Model model){
//      //  model.addAttribute("blog",new BlogSaveRequest());
//    return "createBlog";
//    }
}
