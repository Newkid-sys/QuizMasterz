package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class QuizRepository {

        String path = "QuizFolder"; //Define a path, name of the folder
        File dir = new File(path);//Define where the folder or path is going to be

        File quizFile = new File(path);
        //File quizFiles = new File(quizFile);


        public File getQuizFile() {
            quizFile.mkdir();
            return quizFile;
        }

    }


