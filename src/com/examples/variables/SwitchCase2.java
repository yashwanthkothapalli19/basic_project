// simple calculator



package com.examples.variables;
import java.util.Scanner;
public class SwitchCase2 {
    int num1 ;
    int num2 ;

    public static void main(String[] args) {
        SwitchCase2 sc2 = new SwitchCase2();
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the first number :");
        sc2.num1 = scan.nextInt();
        System.out.print("enter the second number :");
        sc2.num2 = scan.nextInt();
        System.out.print("enter the operator :");
        char operator ;
        operator = scan.next().charAt(0);
        int result;
        result = 0;
        switch (operator){
            case '+' :
                result = sc2.num1+sc2.num2;
                break;
            case '-' :
                result =sc2.num1-sc2.num2;
                break;
            case '*' :
                result = sc2.num1*sc2.num2;
                break;
            case '/' :
                result =sc2.num1/sc2.num2;
                break;
            case '%' :
                result = sc2.num1%sc2.num2;
                break;
            default:
                System.out.println("invalid operator");

        }
        System.out.println("the final result is :" + result);



    }


}
