package com.examples.variables;
import java.util.Scanner;

public class UserAuthentication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded correct username and password
        String correctUsername = "admin";
        String correctPassword = "password123";

        int attempts = 0;
        boolean isAuthenticated = false;

        while (attempts < 3 && !isAuthenticated) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                isAuthenticated = true;
                System.out.println("Welcome, " + username + "!");
            } else {
                attempts++;
                System.out.println("Incorrect username or password. Attempt " + attempts + " of 3.");
            }
        }

        if (isAuthenticated==false) {
            System.out.println("Account locked due to too many failed attempts.");
        }

        scanner.close();
    }
}
