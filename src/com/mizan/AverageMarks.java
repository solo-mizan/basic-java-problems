package com.mizan;
import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {

        // Create an object of Scanner class -->
        Scanner input = new Scanner(System.in);

        // Get the number of courses from user -->
        System.out.print("Enter your number of courses: ");
        int courseNumber = input.nextInt();

        // Create an array to store every courses marks -->
        float[] marks = new float[courseNumber];
        float totalNumber = 0;
        float avg;

        // Take individual marks as input from user -->
        for (int i = 0; i < courseNumber; i++){
            System.out.print("Enter the marks of " + (i + 1) + "th subject: ");
            marks[i] = input.nextFloat();
            totalNumber = totalNumber + marks[i];
        }

        // Calculate the average and print it -->
        avg = totalNumber / courseNumber;
        System.out.println("The average marks is " + avg);
    }
}