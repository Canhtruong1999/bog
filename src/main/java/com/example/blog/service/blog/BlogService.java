package com.example.blog.service.blog;

import com.example.blog.Repository.BlogRepository;
import com.example.blog.model.Blog;
import com.example.blog.service.blog.request.BlogSaveRequest;
import com.example.blog.service.blog.respone.BlogListRespone;
import com.example.blog.utils.AppUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
        private final BlogRepository blogRepository;

        public BlogService(BlogRepository blogRepository) {
                this.blogRepository = blogRepository;
        }


        public Page<BlogListRespone> searchAll(String search , Pageable pageable){
                search  = "%" + search + "%";
                var a= blogRepository.SearchAll(search,pageable);
                return blogRepository.SearchAll(search,pageable).map(Blog ->{
                        var response = AppUtils.mapper.map(Blog,BlogListRespone.class);
                        return response;
                });
        }
        public void create(BlogSaveRequest request){

                Blog blog = AppUtils.mapper.map(request, Blog.class);
                //newProduct.setCategory(new Category(Long.valueOf(request.getCategoryId())));
                blogRepository.save(blog);
        }
}
