package com.ami.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ami.entities.User;
/**
 * 
 * @author amaresh.kumar
 *
 */
@Repository
public interface UserRepository {
	
	public User save(User user);

	public User findOne(String id);
	
	public User findOneByUsername(String str);
}
