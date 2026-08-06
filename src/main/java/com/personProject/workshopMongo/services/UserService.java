package com.personProject.workshopMongo.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personProject.workshopMongo.domain.User;
import com.personProject.workshopMongo.repository.UserRepository;

@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		var response = repo.findAll();
		logger.info("Esta aqui e a lista retornada {}", response);
		return response;
	}
}