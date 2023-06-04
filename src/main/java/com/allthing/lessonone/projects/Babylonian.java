/*
1. Make a guess at the answer (you can pick n/2 as your initial guess).
2. Compute r = n / guess
3. Set guess = (guess +r)/ 2
4.Go back to step 2 for as many iterations as necessary. The more you repeat steps
2 and 3, the closer guess will become to the square root of n .

Write a program that inputs a double for n , iterates through the Babylonian algorithm five times,
and outputs the answer as a double to two decimal places. Your
answer will be most accurate for small values of n .
 */


package com.allthing.lessonone.projects;

import java.util.Scanner;

public class Babylonian {
    public static void main(String[] args) {
        //1. scanner to get user input
        Scanner keyboard = new Scanner(System.in);
        
        //2. variable n
        System.out.println("Give me a number to find the square root of:");
        double n = Double.parseDouble(keyboard.nextLine());
        
        double guess = n / 2.0;
        //3. algorithm
        
        guess = algorithm(n, guess);
        guess = algorithm(n, guess);
        guess = algorithm(n, guess);
        guess = algorithm(n, guess);
        guess = algorithm(n, guess);
        
        System.out.printf("Approximate square root is: %.2f\n", guess);
    }
    
    
    // EXAMPLE: 10 < -- n
    // Guess 1 = 5 < -- first guess
    // r = 10 / 5
    // guess = (5 + 2) / 2
    private static double algorithm(double n , double guess){
        double r = n / guess;
        return (guess + r) / 2.0;
    }
}
