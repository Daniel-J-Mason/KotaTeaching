package com.allthing.lessontwo.projects;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RGBPattern {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a valid 5 character RBG pattern");
        String enteredPattern = keyboard.nextLine();
        
        while (!validUserInput(enteredPattern)) {
            System.out.println("Please enter a valid 5 character RGB pattern");
            enteredPattern = keyboard.nextLine();
        }
        
        System.out.println(validPattern(enteredPattern) ? "Pattern is valid": "Pattern is invalid");
        
    }
    
    private static boolean validPattern(String userPattern){
        char previousCharacter = 'z';
        for (char character: userPattern.toCharArray()){
            if (character == previousCharacter){
                return false;
            }
            previousCharacter = character;
        }
        
        return true;
    }
    
    private static boolean validUserInput(String attempt){
        Pattern pattern = Pattern.compile("^[RGB]{5}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(attempt);
        return matcher.find();
        
    }
}
