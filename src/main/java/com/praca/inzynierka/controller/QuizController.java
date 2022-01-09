package com.praca.inzynierka.controller;

import com.praca.inzynierka.entity.Quiz;
import com.praca.inzynierka.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin("*")
@RestController
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/quiz")
    public List<Quiz> getQuiz() {
        return quizService.getQuiz();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/quiz/{id}")
    public Quiz getQuiz(@PathVariable long id) {
        return quizService.getQuizById(id);
    }

    @PostMapping("/quiz")
    public void addQuiz(@RequestBody Quiz quiz){
        quizService.addQuiz(quiz);
    }
}
