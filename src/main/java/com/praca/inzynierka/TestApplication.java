package com.praca.inzynierka;

import com.praca.inzynierka.entity.Quiz;
import com.praca.inzynierka.repository.QuizRepository;
import com.praca.inzynierka.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}


	@Bean
	CommandLineRunner init(UserRepository userRepository, QuizRepository quizRepository) {
		AtomicInteger i = new AtomicInteger(1);
		return args -> Stream.of("Math quiz", "Other quiz", "IT quiz", "Better quiz").forEach(title -> {
			Quiz quiz = new Quiz(title, title + " description of quiz description of quiz description of quiz description of quiz description of quiz description of quiz description of quiz description of quiz"
			, new Date(), new Date(), "shiba" + i.getAndIncrement());
			quizRepository.save(quiz);
		});
	}
}
