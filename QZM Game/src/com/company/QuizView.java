package com.company;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

    public class QuizView  {

        private String userName;
        private String passWord;
        private int score;
        static Scanner input = new Scanner(System.in);

        public String printMessage(){//Put a loop to return back to the start
            System.out.println("Welcome to QuizMasters!");
            System.out.println("Choose 1 for existing user or 2 for new user");
            String choice = input.nextLine();
            loginPage();
            switch (choice){
                case  "1":
                    loginPage();
                    break;
                case "2":
                    loginPage();
                    break;
                default:
                    System.exit(0);
            }

            return choice;
        }

        public void loginPage(){

            //File userFile = new File("Usernames.txt");
            //Show if the account doesn't exists, have a file name to store all the username
            try {
                File userFile = new File("/Users/ahmedmayan/Documents/QuizMasterz/QuizFolder/Username.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(userFile));
                userName = "";
                passWord = "";
                System.out.println("         QuizMasters           ");
                System.out.print("Enter your username: " + userName);
                userName = input.nextLine();
                System.out.print("Enter your password: " + passWord);
                passWord = input.nextLine();

            }catch(IOException e){
                System.out.println("Sorry error occured");
                e.printStackTrace();
            }


/*
        if(!userFile.exists()) {
            Scanner userInputFile = new Scanner(new File(getUserName()));
            while(userInputFile.hasNextLine()) {
                Scanner input = new Scanner(userName);

            }
            userInputFile.close();
        }

        System.out.println();
        System.out.println();
        System.out.println("Create an account here: ");


 */

        }



        public void signOut(){
            //Scanner input = new Scanner(System.in);
            System.out.println("You're signed out!");
        }

        public String getUserName() {
            return userName;
        }

        public int getScore(){
            return score;
        }

        public String printStartQuiz(){
            String message = "Start quiz!";
            System.out.println(message);
            return message;
        }

        public void printEndQuiz(){
            System.out.println("Quiz Finished");
        }


        public void showPointsRanking(com.company.QuizView quizPlayer){
            System.out.println("Player's name is "+quizPlayer.getUserName()+" and their score is "+quizPlayer.getScore());
        }

        public String selectRole(){
            Scanner selection = new Scanner(System.in);
            String role = selection.nextLine();
            System.out.println("Do you want to be QuizTaker or QuizMaster? ");
            switch(role) {
                case "QuizMaker":
                    System.out.println("Congrats! You've become a QuizMaker");
                    displayQuizMaker();
                    break;
                case "QuizTaker":
                    System.out.println("Congrats! You've become a QuizTaker");
                    displayQuizTaker();
                    break;
                default:
                    signOut();
                    break;
            }
            return role;

        }

        public void displayQuizMaker(){
            System.out.println("Welcome to the QuizMaker Menu!");
            System.out.println("You have the power to create quizzes for students\nYou can make as many quizzes as you want or as little as you want :)");

        }

        public void displayQuizTaker(){
            System.out.println("Welcome to QuizTaker Menu!");
            System.out.println("You can take as many quizzes as you want :)");
        }
/*
    public String subjectName(QuizMaker subject){
        String quizSubject = subject.getSubject();
        Scanner selection = new Scanner(System.in);
        System.out.println("What's the subject that you want to quiz on?");
        quizSubject = selection.nextLine();
        return quizSubject;
    }



    public void printQuestions(Quiz questions){
        String [] answer = questions.getAnswers();

        System.out.println("A" + answer[0]);
        System.out.println("B" + answer[1]);

*/


    }

