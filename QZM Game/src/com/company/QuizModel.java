package com.company;
import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizModel {
        private String quizName;
        private String quizSubject;
        private String [] answer;
        private String correctAnswer;
        private String quizQuestions;
        static ArrayList<String> questionList = new ArrayList<String>();


        //Used to generate the list of questions
        public void generateQuestion() {

            //Generates the list of questions and answers
            Scanner input = new Scanner(System.in);
            String question = "";
            String correctAnswer = "";
            System.out.println("Quiz Questions:");
            while(true) {
                if (question.equalsIgnoreCase("Stop")) {
                    break;
                }
                else {
                    question = input.nextLine();
                    questionList.add(question);
                }
            }

            displayQuestions();

        }

        public void uploadFiles(){//PrintWriter used to put characters into a file

            //String questionList = displayQuestions();
            Scanner input = new Scanner(System.in);
            String question = "";

            while(true) {
                if (question.equalsIgnoreCase("Stop")) {
                    break;
                }
                else {
                    question = input.nextLine();
                    questionList.add(question);
                    System.out.println(questionList);
                }
            }

            //PrintWriter quizUpload = createFile("Quiz Folder");
            try{
                File quizObj = new File("/Users/ahmedmayan/Documents/QuizMasterz/QuizFolder/QuizzesPractice.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(quizObj));
                PrintWriter p = new PrintWriter(writer);
                p.println(questionList);
                p.close();
            }catch(IOException e){
                System.out.println("Error occured!");
                e.printStackTrace();
            }

        }
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
        public void provideAnswers(){

            displayQuestions();

            //if(answer.length > 2){
            //    throw new IllegalArgumentException("Sorry there's only two answers allowed");
            //}
            //if(!correctAnswer.equalsIgnoreCase("A") && !correctAnswer.equalsIgnoreCase("B")){
            //    throw new IllegalArgumentException("The answer is within the letters and string has to ");
            //}




            //Get the questions and answers from the
        }

        public void displayAnswers(){

        }

        public String displayQuestions() {
            //Displays the questions in a sentence format

            for (String quizQuestions : questionList) {
                System.out.println(quizQuestions);
            }

            return quizQuestions;
        }

        public String[] getAnswer() {
            return answer;
        }

        private void setQuizName(String quizName){
            this.quizName = quizName;
        }

        public String getQuizName() {
            return quizName;
        }

        public String getQuizSubject(){
            return quizSubject;
        }

        public String quizQuestions(){
            return quizQuestions;
        }

    }



