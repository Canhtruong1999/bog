package com.example.blog.controller.api;

import com.example.blog.Repository.TagRepository;
import com.example.blog.model.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/tags")
public class TagRescontroller {
    private final TagRepository tagRepository;

    public TagRescontroller(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }
    @GetMapping
    public List<Tag> findAll(){
        return tagRepository.findAll();
    }
}
