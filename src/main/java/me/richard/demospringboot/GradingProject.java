package me.richard.demospringboot;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Scanner;
import java.util.Random;

public class GradingProject{
    public String showIndex() {
        String studentName, studentLetter;
        Integer studentNumber;
        System.out.println("Please insert the Student Name");
        Scanner keyboard = new Scanner(System.in);
        studentName = keyboard.nextLine();
        System.out.println("Hello " + studentName + ". Please input your student number to continue.");
        studentNumber = keyboard.nextInt();
        System.out.println("Thank you.");
        Random testScore = new Random();
        double studentTestScore = testScore.nextInt(50) + 50;
        double studentGrade = (studentTestScore/50);
        if (studentGrade >= 0.90) {
            studentLetter = ("A");
        }else if (studentGrade >= 0.80){
            studentLetter = ("B");
        }else if (studentGrade >= 0.70){
            studentLetter = ("C");
        }else if (studentGrade >= 0.60){
            studentLetter = ("D");
        }else {
            studentLetter = ("F");
        }
        return(studentName + "(" +studentNumber + "), your test score was "+ studentTestScore +". Which gives you a final grade of " + studentLetter + ".");
    }
}