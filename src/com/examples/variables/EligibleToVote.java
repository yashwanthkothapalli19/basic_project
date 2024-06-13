package com.examples.variables;
import java.util.Scanner;
public class EligibleToVote {
    public static void main(String[] args) {
        byte age ;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age :");
        age = scan.nextByte();
        if(age>=18){
            System.out.println("your are eligible to vote....");
        }
        else {
            System.out.println("you are not eligible to vote");
        }
    }
}
