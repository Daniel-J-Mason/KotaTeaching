package com.allthing.lessontwo.projects;

import java.util.Scanner;

public class ImprovedBabylonian {
    public static void main(String[] args) {
        //1. scanner to get user input
        Scanner keyboard = new Scanner(System.in);
        
        //2. variable n
        System.out.println("Give me a number to find the square root of:");
        double n = Double.parseDouble(keyboard.nextLine());
        
        double guess = n / 2.0;
        double previousGuess;
        
        int count = 0;
        //3. Guess until guesses are within 1% of each other
        do {
            previousGuess = guess;
            guess = (guess + (n / guess)) / 2.0;
            count++;
        } while (guess / previousGuess < .99);
        
        System.out.printf("Your square root is : %f\n", guess);
        System.out.printf("Took %d steps\n", count);
    }
}
