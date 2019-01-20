package com.ami.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Profile("jpa")
// Custom JPA configuration here
@EnableJpaRepositories("com.ami.entities")
// @EnableJpaAuditing
public class JpaConfiguration {
}
