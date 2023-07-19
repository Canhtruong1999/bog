package com.example.blog.service.blog.respone;

import com.example.blog.model.Author;
import com.example.blog.model.BlogTag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogListRespone {
private String title;
private String content;
private Author author;
private LocalDate publishDate;
private List<BlogTag> blogTagList;
}
