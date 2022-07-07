package com.example.projetbackend;

import com.example.projetbackend.model.entity.Post;
import com.example.projetbackend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProjetbackendApplication {

	@Autowired
	public PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetbackendApplication.class, args);
	}


	public void run(String... args) throws Exception {
		//Post newPost = new Post("Hello World");
		//postRepository.save(newPost);

		//List<Post> posts = postRepository.findAll();

		//for(Post post : posts){
		//	System.out.println(post	.getMessage());
		//}

	}
}
