package com.allthing.lessonone;

public class Strings {
    public static void main(String[] args) {
        String name = "Daniel";
        String statement = "is 27 years old. Fuck.";
        
        System.out.println(name + " " + statement + "\n");
        System.out.printf("%s is using string interpolation and %s\n", name, statement);
        
        System.out.println("Daniel".equalsIgnoreCase("daniel"));
        
        String animal = "elephant";
        
        System.out.println(animal.length());
        
        StringBuilder sentenceDemo = new StringBuilder();
        
        sentenceDemo.append("This").append(" is a");
        
        //SOME STUFF HAPPENING
        
        sentenceDemo.append(" full sentence");
        
        String sentence = sentenceDemo.toString();
        
        System.out.println("For dramatic effect \"Daniel\"");
    }
}
