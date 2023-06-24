package com.allthing.lessontwo;

public class ForLoops {
    public static void main(String[] args) {
        
        int i;
        int sum;
        
//        for (int i = 0; i <= 10; i++){
//            System.out.println(i);
//        }
        
        for(i = 10, sum = 0; i >= 0 || sum > 40; i--){
            System.out.println(i);
            sum += i;
        }
        
        System.out.println(sum);
        
    }
}
