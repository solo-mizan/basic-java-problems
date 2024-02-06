package com.mizan;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some integer digits: ");
        int digits = input.nextInt();
        int digitCount = 0;
        while (digits != 0){
            digitCount = digitCount + 1;
            digits = digits / 10;
        }
        System.out.println("Total digits is " + digitCount);

    }
}
