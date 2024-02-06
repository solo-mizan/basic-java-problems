package com.mizan;
import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char symbol = input.nextLine().charAt(0);

        switch (symbol){
            case 'a' :
                System.out.println("It's a vowel.");
                break;
            case 'e' :
                System.out.println("It's a vowel.");
                break;
            case 'i' :
                System.out.println("It's a vowel.");
                break;
            case 'o' :
                System.out.println("It's a vowel.");
                break;
            case 'u' :
                System.out.println("It's a vowel.");
                break;
            default:
                System.out.println("It's consonant.");
        }
    }
}
