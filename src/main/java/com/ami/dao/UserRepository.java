package com.ami.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ami.entities.User;
/**
 * 
 * @author amaresh.kumar
 *
 */

/* this the user  Repository interface  */ 
@Repository
public interface UserRepository extends MongoRepository<User, String> {

public User findOneByUsername(String username);
}
