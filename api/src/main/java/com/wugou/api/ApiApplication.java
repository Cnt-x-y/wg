package com.wugou.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        ElasticsearchAutoConfiguration.class
})
public class ApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Logger logger = LoggerFactory.getLogger(ApiApplication.class);
        for (int i = 0; i < 2; i++) {
            logger.error("user = {},post_date = {},message = {}", i, i,i);
        }
    }
}
