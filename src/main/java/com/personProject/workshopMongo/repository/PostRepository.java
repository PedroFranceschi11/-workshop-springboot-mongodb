package com.personProject.workshopMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.personProject.workshopMongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
