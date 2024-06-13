
// printing date and time using Switch case


package com.examples.variables;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Scanner;
// printing date and time
public class SwitchCase4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        while (true) {
        System.out.print("enter your choice :");
        choice = scan.nextInt();

            switch (choice) {
                case 1:
                    LocalDate currentDate = LocalDate.now();
                    System.out.println("current date :" + currentDate);
                    break;
                case 2:
                    LocalTime currentTime = LocalTime.now();
                    System.out.println("current time :" + currentTime);
                    break;
                case 3:
                    LocalDateTime currentDateTime = LocalDateTime.now();
                    System.out.println("current date and time :" + currentDateTime);
                    break;

                default:
                    System.exit(0);
            }
        }
    }
}
