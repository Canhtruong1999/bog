package com.example.blog.service.blog.request;

import com.example.blog.model.BlogTag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data@AllArgsConstructor
@NoArgsConstructor
public class BlogSaveRequest {
    private String title;
    private String content;
    private String publishDate;
    private List<BlogTagSaveRequest> blogTagList;
    private SelectOptionRequest author;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class BlogTagSaveRequest{
        private SelectOptionRequest tag;
    }
}
