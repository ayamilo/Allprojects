package day08;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("what is your current speed, dear driver");
        int currentSpeed = scan.nextInt();
        System.out.println("what is the speed limit");
        int speedlimit = scan.nextInt();
        if(currentSpeed>=speedlimit) {
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        }

        System.out.println("THE END OF THE STROY,MOVE ON");

    }
}
