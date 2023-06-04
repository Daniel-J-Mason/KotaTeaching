package com.allthing.lessonone.projects;

import java.util.Scanner;

public class BetterPigLatinName {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("First Name?");
        String first = keyboard.nextLine();
        
        System.out.println("Last Name?");
        String last = keyboard.nextLine();
        
        first = pigLatin(first);
        last = pigLatin(last);
        
        System.out.printf("Your pig latin name is: %s %s\n", first, last);
    }
    
    private static String pigLatin(String input){
        return capitalize(input.substring(1) + input.charAt(0) + "ay");
    }
    
    private static String capitalize(String input){
        String result;
        result = input.toLowerCase();
        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }
}
