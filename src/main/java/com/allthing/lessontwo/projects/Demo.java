package com.allthing.lessontwo.projects;

public class Demo {
    public static void main(String[] args) {
        String stringDemo = "";
        
        stringDemo += "R";
        stringDemo += "G";
        stringDemo += "B";
        
        System.out.println(stringDemo);
        
        StringBuilder betterDemo = new StringBuilder();
        
        betterDemo.append("RGB").append("G").append("B");
        
        System.out.println(betterDemo);
    }
}
