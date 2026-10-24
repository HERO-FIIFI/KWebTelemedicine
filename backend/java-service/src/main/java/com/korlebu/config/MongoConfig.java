package com.korlebu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.korlebu.repository")
public class MongoConfig {
    // Custom configuration settings can be added here if needed.
}
