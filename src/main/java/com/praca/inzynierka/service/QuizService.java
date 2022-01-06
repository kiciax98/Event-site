package com.praca.inzynierka.service;

import com.praca.inzynierka.entity.Quiz;
import com.praca.inzynierka.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private QuizRepository quizRepository;

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<Quiz> getQuiz() {
        return quizRepository.findAll();
    }

    public Quiz getQuizById(long id) {
        return quizRepository.findById(id).get();
    }

    public void addQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }
}
