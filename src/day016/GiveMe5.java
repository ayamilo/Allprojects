package day016;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {
        // i want to ask user to enter a number
        // i will keep asking until user actually enter a number 5
        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();
        if (userNumber != 5) {
            System.out.println("give me five");


        }
            System.out.println("end program");

    }
}