package com.allthing.lessonone.projects;

public class Functions {
    
    public static double publicStaticAlgorithm(double n, double guess){
        double r = n / guess;
        return (guess + r) / 2.0;
    }
    
    private static double privateStaticAlgorithm(double n, double guess){
        return publicStaticAlgorithm(n, guess);
    }
    
    public double publicAlgorithm(double n, double guess){
        return publicStaticAlgorithm(n, guess);
    }
    
    private double privateAlgorithm(double n, double guess){
        return publicAlgorithm(n, guess);
    }
}
