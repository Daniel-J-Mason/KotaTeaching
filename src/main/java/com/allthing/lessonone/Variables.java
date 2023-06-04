package com.allthing.lessonone;

public class Variables {
    public static void main(String[] args) {
        int number = 10;
        //number = number + 5
        //number += 5;
        //number %= 4;
        
        int valueReturnedFromMethod = numberMethod(number);

        tripleNumberPrinter(valueReturnedFromMethod);
        
    }
    
    private static int numberMethod(int input){
        return input * 5;
    }
    
    private static void tripleNumberPrinter(int input){
        System.out.println(input);
        System.out.println(input);
        System.out.println(input);
    }
}
