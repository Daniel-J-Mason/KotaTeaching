package com.allthing.lessontwo;

public class LambdaConditional {
    public static void main(String[] args) {
        int numberOne = 5;
        
        int numberTwo = 4;
        
        if (numberOne > numberTwo){
            System.out.println(numberOne);
        } else {
            System.out.println(numberTwo);
        }
        
        
        System.out.println(numberOne > numberTwo ? numberOne : numberTwo);
        
        int count = 0;
        int limite = 10;
        
        System.out.print(limite < 20 || limite / count < 7);
        
    }
}
