package com.allthing.lessontwo;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        for (int i = 0; i < 15; i++){
            System.out.println(randomGenerator.nextInt(3) + 2);
        }
    }
}
