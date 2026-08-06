package com.personProject.workshopMongo.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personProject.workshopMongo.domain.User;
import com.personProject.workshopMongo.repository.UserRepository;
import com.personProject.workshopMongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		 return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}