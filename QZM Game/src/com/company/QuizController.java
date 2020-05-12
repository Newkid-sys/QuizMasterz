 package com.company;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

    public class QuizController {

        private QuizModel quiz;
        private QuizView view;

        public QuizController(QuizModel quiz, QuizView view){
            this.quiz = quiz;
            this.view = view;

        }

        public String viewMessage(){
            return view.printMessage();
        }

        public String selectRole(){

            if(view.selectRole().equalsIgnoreCase("QuizMaker")){
                view.displayQuizMaker();
            }
            else if(view.selectRole().equalsIgnoreCase("QuizTaker")){
                view.displayQuizTaker();
            }
            else{
                view.printMessage();
            }

            return view.selectRole();
        }

        //public String getQuiz() {
        //    view.printStartQuiz();
        //  return quiz.generateQuestion();
        //}

        //public void uploadFiles(){//PrintWriter used to put characters into a file

        //  PrintWriter quizUpload = createFile("Quiz Folder");
        // for(String quizzes : quizUpload){

        //}

        //}

        /*
        public static PrintWriter createFile(String fileName){
            try{
                File listOfQuizzes = new File(fileName);
                PrintWriter quizWrite = new PrintWriter(new BufferedWriter(new FileWriter(listOfQuizzes)));
            }
            catch (IOException e){
                System.out.println("IO Error occured");
                System.exit(0);
            }
            return null;
        }
         */



        public String printStart(){
            return view.printStartQuiz();
        }

        //public String getAnswers(){}




    }


