package com.allthing.lessontwo;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Savings:");
        double savings = Double.parseDouble(keyboard.nextLine());
        System.out.println("Enter Expenses");
        double expenses = Double.parseDouble(keyboard.nextLine());
        
        if (savings >= expenses){
            System.out.printf("Savings remaining after expense are $%.2f", savings-expenses);
        } else {
            System.out.println("You're bankrupt, man");
        }
    }
}
