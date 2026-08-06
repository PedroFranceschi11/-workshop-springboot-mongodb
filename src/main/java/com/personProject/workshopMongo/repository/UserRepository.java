package com.personProject.workshopMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.personProject.workshopMongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
