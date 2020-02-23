package day09;

import java.util.Scanner;

public class DayPrinter_With_SwitchStatement {
    public static void main(String[] args) {
//        Scanner scan= new Scanner(System.in);
//        System.out.println("please enter your day code");
//
//        int dayCoda=scan.nextInt();
        int dayCoda=1;
        switch(dayCoda){
            case 1:
                System.out.println("day is monday");
                break;//used to get out of this branch
            case 2:
                System.out.println("day is tuesday");
                break;
            case 3:
                System.out.println("day is wednesday");
                break;
            case 4:
                System.out.println("day is thursday");
                 break;
            case 5:
                System.out.println("day is friday");
                break;
            case 6:
                System.out.println("day is saturday");
                break;
            case 7:
                System.out.println("day is sunday");
                break;
            default:
                System.out.println("day is unknown");

        }
    }
}
