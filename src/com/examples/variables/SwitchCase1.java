
//printing week days

package com.examples.variables;
import java.util.Scanner ;
public class SwitchCase1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int WeekDay ;
        WeekDay = obj.nextInt();
        switch(WeekDay){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thursday");
                break;
            case 5 :
                System.out.println("friday");
                break;
            case 6 :
                System.out.println("saturday");
                break;
            case 7 :
                System.out.println("sunday");
                break;
            default :
                System.out.println("invalid input enter within 1 to 7 only");

        }
    }
}
