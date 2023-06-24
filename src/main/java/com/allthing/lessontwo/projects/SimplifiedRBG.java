package com.allthing.lessontwo.projects;

import java.util.Scanner;

public class SimplifiedRBG {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a valid 5 character RBG pattern");
        String enteredPattern = keyboard.nextLine();
        
        System.out.println(validPattern(enteredPattern) ? "Pattern is valid": "Pattern is invalid");
        
    }
    
    private static boolean validPattern(String userPattern){
        char previousCharacter = userPattern.charAt(0);
        
        for (int i = 1; i < userPattern.length(); i++){
            if (userPattern.charAt(i) == previousCharacter){
                return false;
            }
            previousCharacter = userPattern.charAt(i);
        }
        
        return true;
    }
}
