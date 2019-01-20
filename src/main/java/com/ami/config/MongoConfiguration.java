package com.ami.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("mongodb")
// Custom Mongo configuration here
// @EnableMongoRepositories("com.sogilis.example.springbootjpamongo")
// @EnableMongoAuditing
public class MongoConfiguration {
}
