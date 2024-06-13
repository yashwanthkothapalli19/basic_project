package com.examples.variables;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SwitchCase6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String category;
        int originalPrice;
        int discount=0;
        int discountAmount;
        int finalPrice;
        System.out.println("enter the category :");
        category = scan.nextLine();
        System.out.println("enter the original price :");
        originalPrice = scan.nextInt();
        System.out.println("original price is : " + originalPrice);
        switch (category) {
            case "Electronics":
                discount = 10;
                break;
            case "Clothes":
                discount = 20;
                break;
            case "Groceries":
                discount = 5;
                break;
            case "Furniture":
                discount = 15;
                break;
            case "Books":
                discount = 8;
                break;
            default:
                System.out.println("invalid product category");
        }
        discountAmount = (originalPrice*discount)/100;
        System.out.println("Discount Amount is : "+ discountAmount);
        finalPrice  = originalPrice - discountAmount ;
        System.out.println("Final Price : "+finalPrice);
    }
}
