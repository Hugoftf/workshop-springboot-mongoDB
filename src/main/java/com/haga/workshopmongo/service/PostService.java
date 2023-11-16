package com.haga.workshopmongo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haga.workshopmongo.domain.Post;
import com.haga.workshopmongo.domain.User;
import com.haga.workshopmongo.repository.PostRepository;
import com.haga.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	
	@Autowired
	private PostRepository postRepository;
	
	
	public Post findById(String id) {
		Optional<Post> user = postRepository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}	
}
