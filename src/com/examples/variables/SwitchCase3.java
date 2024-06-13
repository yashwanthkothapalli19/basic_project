// season finder


package com.examples.variables;
import java.util.Scanner;
public class SwitchCase3 {
    public static void main(String[] args) {
        int monthNo;
        System.out.print("enter the month number between (1 to 12) :");
        Scanner scan = new Scanner(System.in);
        monthNo = scan.nextInt();
        switch(monthNo){
            case 1 :
            case 12 :
            case 2 :
                System.out.println("Winter");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Spring");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Summer");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Autumn");
                break;
            default :
                System.out.println("invalid months");
        }

    }
}
