package com.ami.dao.jpa;

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
@Profile("jpa")
public interface UserRepositoryJPA extends UserRepository, JpaRepository<User, String> {

public User findOneByUsername(String username);
}
