package com.allthing.lessonone;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String name;
        int age;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = scanner.nextLine();
        
        System.out.println("How old are you?");
        age = Integer.parseInt(scanner.nextLine());
        
        System.out.printf("So your name is %s and you are %d years old?", name, age);
    }
}
