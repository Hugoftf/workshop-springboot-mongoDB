package com.haga.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.haga.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
