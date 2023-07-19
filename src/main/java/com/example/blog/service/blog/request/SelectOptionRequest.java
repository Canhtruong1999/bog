package com.example.blog.service.blog.request;

public class SelectOptionRequest {
    private String id;

    public SelectOptionRequest(String id) {
        this.id = id;
    }

    public SelectOptionRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
