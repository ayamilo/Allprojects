package day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        //i want to save users input after asking some questions
        // and i want to save this input so i can do something with it

        // Step1: use scanner to create scanner object
        // that have functionality
        Scanner scan = new Scanner(System.in);
        // ask user to enter name
        System.out.println("Enter your first name please :");
        //capture what user typed on keyboard in console
        String firstName = scan.next();
        // print the result of what we saved from user input
        System.out.println("You have entered : " + firstName);
        System.out.println("enter last name : ");
        String lastName=scan.next();
        System.out.println("you have entered your last name as: " +lastName);
        System.out.println("enter your age");
        String age = scan.next();
        System.out.println("my age is : " +age);



    }
}
