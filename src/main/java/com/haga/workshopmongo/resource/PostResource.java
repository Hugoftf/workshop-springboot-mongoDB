package com.haga.workshopmongo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haga.workshopmongo.domain.Post;
import com.haga.workshopmongo.service.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

	@Autowired
	private PostService postService;
		
	@GetMapping(value="/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = postService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
