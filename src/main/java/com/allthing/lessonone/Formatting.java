package com.allthing.lessonone;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Formatting {
    public static void main(String[] args) {
        double money = 1.75;
        double first = 12.34;
        double second = 1000.234;
        double third = 123.3;
        double fourth = 40;
        //System.out.printf("$ %6.2f", money);
        System.out.printf("$ %8.2f\n", first);
        System.out.printf("$ %8.2f\n", second);
        System.out.printf("$ %8.2f\n", third);
        System.out.printf("$ %8.2f\n", fourth);
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        
        System.out.println(formatter.format(15.3));
        
        
        
        DecimalFormat customFormatter = new DecimalFormat("00000.00");
        
        System.out.println(customFormatter.format(10000.234));
    }
}
