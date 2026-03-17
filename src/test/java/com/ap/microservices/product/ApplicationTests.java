package com.ap.microservices.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.testcontainers.mongodb.MongoDBContainer;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTests {

    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:7.0");

    @Test
	void shouldCreateProduct() {

	}

}
