package day019;

import java.util.Scanner;

public class WarmUp_speedUp_Scanner {
    public static void main(String[] args) {
        // create a class called SpeedAction
        //create 2 int variable called start, end
        // assuming start speed is always less than end speed
        // create  for loop to stimulate slow increase of the speed ,
        // for example: if start 10, and end 27
        //print ----> 10, 11 , 12, 13............27
        // if start 2, end 5 ------> 2,3,4,5
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER STARTING SPEED AND ENDING SPEED");


        int start = scan.nextInt();
        int end = scan.nextInt();


        for (int i = start; i <= end; ++i) {
            System.out.print(i + " ,");

        }
    }
}