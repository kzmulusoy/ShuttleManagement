package com.shuttlemanagement.configuration;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfiguration {

	@Value("${spring.data.mongodb.database}")
	String mongoDatabase;

	@Value("${spring.data.mongodb.host}")
	String mongoHost;

	@Value("${spring.data.mongodb.port}")
	int mongoPort;

	@Bean(name = "mongoClient")
	public MongoClient mongoClient() throws IOException {
		return new MongoClient(mongoHost, mongoPort);
	}

	@Autowired
	@Bean(name = "mongoDbFactory")
	public MongoDbFactory mongoDbFactory(MongoClient mongoClient) {
		return new SimpleMongoDbFactory(mongoClient, mongoDatabase);
	}

	@Autowired
	@Bean(name = "mongoTemplate")
	public MongoTemplate mongoTemplate(MongoClient mongoClient) {
		return new MongoTemplate(mongoClient, mongoDatabase);
	}
}
