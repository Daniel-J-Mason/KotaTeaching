package com.allthing.lessonone.projects;

import java.util.Scanner;

public class ShopBill {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String nameOne = scanName(1, keyboard);
        int quantityOne = scanQuantity(1, keyboard);
        double priceOne = scanPrice(1, keyboard);
        double totalOne = quantityOne * priceOne;
        
        String nameTwo = scanName(2, keyboard);
        int quantityTwo = scanQuantity(2, keyboard);
        double priceTwo = scanPrice(2, keyboard);
        double totalTwo = quantityTwo * priceTwo;
        
        String nameThree = scanName(3, keyboard);
        int quantityThree = scanQuantity(3, keyboard);
        double priceThree = scanPrice(3, keyboard);
        double totalThree = quantityThree * priceThree;
        
        System.out.printf("%-16s%-12s%-12s%-5s\n", "Item", "Quantity", "Price", "Total");
        printer(nameOne, quantityOne, priceOne, totalOne);
        printer(nameTwo, quantityTwo, priceTwo, totalTwo);
        printer(nameThree, quantityThree, priceThree, totalThree);
        
        
        double sum = totalOne + totalTwo + totalThree;
        double tax = sum * .0625;
        
        
        System.out.printf("%-40s%5.2f\n", "Subtotal", sum);
        System.out.printf("%-40s%5.2f\n", "6.25% sales tax", tax);
        System.out.printf("%-40s%5.2f\n", "Total", sum + tax );
    }
    
    private static String scanName(int itemNumber, Scanner scanner){
        System.out.printf("Input name of item %d:\n", itemNumber);
        
        return scanner.nextLine();
    }
    
    private static int scanQuantity(int itemNumber, Scanner scanner){
        System.out.printf("Input quantity of item %d:\n", itemNumber);
        return Integer.parseInt(scanner.nextLine());
    }
    
    private static double scanPrice(int itemNumber, Scanner scanner){
        System.out.printf("Input price of item %d:\n", itemNumber);
        return Double.parseDouble(scanner.nextLine());
    }
    
    private static void printer(String name, int quantity, double price, double total){
        System.out.printf("%-16s%-12d%-12.2f%-5.2f\n", name, quantity, price, total);
    }
}
