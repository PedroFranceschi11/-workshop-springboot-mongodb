package com.personProject.workshopMongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personProject.workshopMongo.domain.Post;
import com.personProject.workshopMongo.repository.PostRepository;
import com.personProject.workshopMongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	
	public Post findById(String id) {
	    Optional<Post> post = repo.findById(id);
	    return post.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
	
}