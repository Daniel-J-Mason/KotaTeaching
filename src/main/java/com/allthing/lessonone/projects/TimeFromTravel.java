package com.allthing.lessonone.projects;

public class TimeFromTravel {
    public static void main(String[] args) {
        formula(55, 15);
        formula(76, 13);
    }
    
    private static void formula(int distance, int speed){
        int hours = distance/speed;
        double minutes = distance % (double) speed / speed * 60.0;
        
        System.out.printf("%d hours and %.0f minutes\n", hours, minutes);
    }
}
