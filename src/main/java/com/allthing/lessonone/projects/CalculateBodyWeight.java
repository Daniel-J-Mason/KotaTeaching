package com.allthing.lessonone.projects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculateBodyWeight {
    public static void main(String[] args) {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream("/home/kal/Desktop/people.txt"));
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        
        String firstPersonName = fileIn.nextLine();
        int firstPersonHeight = 12 * Integer.parseInt(fileIn.nextLine());
        firstPersonHeight += Integer.parseInt(fileIn.nextLine());
        
        int firstPersonWeight = weightCalculator(firstPersonHeight);
        weightPrinter(firstPersonName, firstPersonWeight);
        
//        String secondPersonName = fileIn.nextLine();
//        int secondPersonHeight = 12 * Integer.parseInt(fileIn.nextLine());
//        secondPersonHeight += Integer.parseInt(fileIn.nextLine());
//
//        int secondPersonWeight = weightCalculator(secondPersonHeight);
//        weightPrinter(secondPersonName, secondPersonWeight);
//
//        String thirdPersonName = fileIn.nextLine();
//        int thirdPersonHeight = 12 * Integer.parseInt(fileIn.nextLine());
//        thirdPersonHeight += Integer.parseInt(fileIn.nextLine());
//
//        int thirdPersonWeight = weightCalculator(thirdPersonHeight);
//        weightPrinter(thirdPersonName, thirdPersonWeight);

    }
    
    private static void weightPrinter(String name, int weight){
        System.out.printf("%s has an estimated weight of %d\n", name, weight);
    }
    
    private static int weightCalculator(int heightInInches){
        return ((heightInInches - 60) * 5) + 110;
    }
}
