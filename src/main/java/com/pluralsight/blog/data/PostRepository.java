package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Category;
import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    public List<Post> findByCategory(Category category);

}
