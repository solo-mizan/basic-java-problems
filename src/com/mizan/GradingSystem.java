package com.mizan;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your course grade: ");
        float courseNumber = input.nextFloat();

        if(courseNumber >= 80){
            System.out.println("Your grade A+");
        } else if (courseNumber >= 70) {
            System.out.println("Your grade B");
        } else if(courseNumber >= 60){
            System.out.println("Your grade C");
        } else if (courseNumber >= 50) {
            System.out.println("Your grade D");
        } else if (courseNumber >= 40) {
            System.out.println("You have passed.");
        } else {System.out.println("You have failed.");}
        input.close();
    }
}
