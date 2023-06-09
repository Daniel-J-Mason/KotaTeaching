package com.allthing.lessonone.projects;

/*
7. Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine
accepts only a single dollar bill to pay for the item.
For example, a possible sample dialogue might be the following:
Enter price of item
(from 25 cents to a dollar, in 5-cent increments):
45
You bought an item for 45 cents and gave me a dollar,
so your change is
2 quarters,
0 dimes, and
1 nickels.
 */

import java.util.Scanner;

public class Change {
    //quarters, dimes nickels
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the price of an item:");
        int response = Integer.parseInt(keyboard.nextLine());
        int change = 100 - response;
        breakChange(change);
    }
    
    public static void breakChange(int cents){
//        int quarters = cents / 25;
//        int dimes = (cents - (quarters * 25)) / 10;
//        int nickels = (cents - (quarters * 25) - (dimes * 10)) / 5;
        
        int quarters = cents / 25;
        cents = (cents - quarters * 25);
        
        int dimes = cents / 10;
        cents = (cents - dimes * 10);
        
        int nickels = cents / 5;
        
        System.out.printf("Your return is %d quarters, %d dimes, %d nickels\n", quarters, dimes, nickels);
    }
}
