package com.mizan;
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to revers them: ");
        int number = input.nextInt();
        int reverseNumber = 0;
        int temp = number;

        while(temp != 0){
            reverseNumber = (reverseNumber * 10) + (temp % 10);
            temp = temp / 10;
        }
        System.out.println("Reverse number is " + reverseNumber);
    }
}
