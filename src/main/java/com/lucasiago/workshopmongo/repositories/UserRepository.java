package com.lucasiago.workshopmongo.repositories;

import com.lucasiago.workshopmongo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
