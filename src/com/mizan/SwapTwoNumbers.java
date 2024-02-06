package com.mizan;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number A: ");
        int numA = input.nextInt();
        System.out.print("Enter the number B: ");
        int numB = input.nextInt();

        numA = numA * numB;
        numB = numA / numB;
        numA = numA / numB;

        System.out.println("Number A: " + numA);
        System.out.println("Number B: " + numB);
    }
}
