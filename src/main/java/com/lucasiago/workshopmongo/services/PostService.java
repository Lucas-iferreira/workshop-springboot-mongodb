package com.lucasiago.workshopmongo.services;

import com.lucasiago.workshopmongo.entities.Post;
import com.lucasiago.workshopmongo.repositories.PostRepository;
import com.lucasiago.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));
        return post;
    }

    public List<Post> findByTitle(String title) {
        return postRepository.findByTitleContainingIgnoreCase(title);
    }
}
