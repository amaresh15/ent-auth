package com.ami.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@Profile("mongodb")
// Custom Mongo configuration here
@EnableMongoRepositories("com.ami.dao.mongo")
// @EnableMongoAuditing
public class MongoConfiguration {
}
