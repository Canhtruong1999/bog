package com.example.blog.controller.api;

import com.example.blog.Repository.AuthorRepository;
import com.example.blog.model.Author;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/authors")
public class AuthorRescontroller {
private final AuthorRepository authorRepository;

    public AuthorRescontroller(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @GetMapping
    public List<Author> findAll (){
        return authorRepository.findAll();
    }
}
