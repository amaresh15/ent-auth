package com.ami.dao.mongo;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ami.dao.UserRepository;
import com.ami.entities.User;
/**
 * 
 * @author amaresh.kumar
 *
 */

/* this the user  Repository interface  */ 
@Repository
@Profile("mongo")
public interface UserRepositoryMONGO extends UserRepository, MongoRepository<User, String> {

public User findOneByUsername(String username);
}
