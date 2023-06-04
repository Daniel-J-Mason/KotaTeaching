package com.allthing.lessonone.projects;

import java.util.Scanner;

public class PigLatinName {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("First Name?");
        String first = keyboard.nextLine();
        
        System.out.println("Last Name?");
        String last = keyboard.nextLine();
        
        first = first.toLowerCase();
        last = last.toLowerCase();
        
        int firstSize = first.length();
        int lastSize = last.length();
        
        //Daniel --> Daniel.substring(1, 6); --> aniel
        
        //Piglatinize
        first = first.substring(1, firstSize) + first.substring(0, 1) + "ay";
        last = last.substring(1, lastSize) + last.substring(0, 1) + "ay";
        
        //Capitalize
        first = first.substring(0, 1).toUpperCase() + first.substring(0, firstSize + 2);
        last = last.substring(0, 1).toUpperCase() + last.substring(0, lastSize + 2);
        
        System.out.println("Your pig latin name is " + first + " " + last);
    }
}
