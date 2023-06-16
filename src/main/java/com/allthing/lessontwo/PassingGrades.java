package com.allthing.lessontwo;

public class PassingGrades {
    public static void main(String[] args) {
        char grade = 'C';
      
        // Standard switch case
//        switch (grade) {
//            case 'a':
//            case 'A':
//                System.out.println("You dont need to take the final, you have aced my class");
//                break;
//            case 'b':
//            case 'B':
//                System.out.println("Passing but need to take the final");
//                break;
//            case 'c':
//            case 'C':
//                System.out.println("You are borderline, you need to study!!");
//                break;
//            case 'd':
//            case 'D':
//                System.out.println("You are in danger of failing my class");
//                break;
//            case 'f':
//            case 'F':
//                System.out.println("You've failed, no need to take the final");
//                break;
//        }
        
        // Enhanced switch-case
        switch (grade) {
            case 'a', 'A' -> System.out.println("You dont need to take the final, you have aced my class");
            case 'b', 'B' -> System.out.println("Passing but need to take the final");
            case 'c', 'C' -> System.out.println("You are borderline, you need to study!!");
            case 'd', 'D' -> System.out.println("You are in danger of failing my class");
            case 'f', 'F' -> System.out.println("You've failed, no need to take the final");
            default -> System.out.println("No valid grade entered");
        }
    }
}
