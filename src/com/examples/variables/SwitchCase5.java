package com.examples.variables;
import java.util.Scanner;
public class SwitchCase5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String jobPosition ;
        System.out.println("enter the job position :");
        jobPosition = scan.nextLine();
        switch(jobPosition){
            case "Manager" :
                System.out.println("$5000 bonus and 20 days of leave");
                break;
            case "Developer" :
                System.out.println("$3000 bonus and 15 days of leave");
                break;
            case "Tester" :
                System.out.println("$2000 bonus and 10 days of leave");
                break;
            case "HR" :
                System.out.println("$2500 bonus and 12 days of leave");
                break;
            case "intern" :
                System.out.println("$1000 bonus and 5 days of leave");
                break;
            default:
                System.out.println("invalid job position");
        }
    }
}
