package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here


        QuizModel quiz  = new QuizModel();
        QuizView quizView = new QuizView();
        QuizController quizMasterController = new QuizController(quiz,quizView);
        //quizMasterController.viewMessage();
        //quizMasterController.getQuiz();
        //quizView.loginPage();
        quiz.generateQuestion();

        quiz.uploadFiles();
        QuizRepository quizRepository1 = new QuizRepository();
        quizRepository1.getQuizFile();
    }
}
