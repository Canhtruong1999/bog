package com.example.blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private  Author author;
    private String content;
    private String title;
    private LocalDate publishDate;
    @OneToMany(mappedBy = "blog",cascade =CascadeType.ALL)
     @JsonIgnore
    private List<BlogTag> blogTagList;

}
