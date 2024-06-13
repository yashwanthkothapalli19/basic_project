package com.examples.variables;
import java.util.Scanner;
public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance;
        double depositAmount,withdrawAmount,checkBalance;
        balance = 0.0;
        byte choice;
        System.out.println("BANK MENU");
        System.out.println(" 1-->Deposit\n 2-->Withdraw \n 3-->Check Balance \n 4-->Exit");

            System.out.println("WELCOME");
            System.out.println("How can i help you");
            while(true) {
            System.out.print("Enter your choice : ");
            choice = scan.nextByte();
            switch (choice) {
                case 1 :
                    System.out.print("enter the deposit amount : ");
                    depositAmount = scan.nextDouble();
                    balance += depositAmount;
                    System.out.println("you amount is added in your account successfully");
                    break;
                case 2 :
                    System.out.print("enter the withdraw amount :");
                    withdrawAmount = scan.nextDouble();
                    balance -= withdrawAmount;
                    System.out.println("you amount is withdraw from your account successfully");
                    break;
                case 3 :
                    System.out.println("Your current  amount is : " + balance);
                    break;
                case 4 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice.......thankyou");


            }
        }
    }
}
