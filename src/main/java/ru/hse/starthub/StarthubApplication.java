package ru.hse.starthub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication(scanBasePackages = {"controller","service","model", "repository","dto"})
@EnableMongoRepositories(basePackages = {"ru.hse.starthub.repository"})
public class StarthubApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarthubApplication.class, args);
	}

}
