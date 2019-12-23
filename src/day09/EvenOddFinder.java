package day09;



public class EvenOddFinder {
    public static void main(String[] args) {
        // Task 1
       /* Create a class called EvenOddFinder with main method


        Write a program to find out a number is even or odd
        Create a int variable called myNumber and assign a value

        If the number is even then says  this is a even number
        If the number is odd then says  this is a odd number





        */
       //Solution task 1

        int myNumber = 7;
        System.out.println(myNumber / 2);
        System.out.println(myNumber % 2);
        // % check remainder
        int remainder = myNumber % 2;
        if (remainder == 0) {
            System.out.println("Even Number");

        } else {
            System.out.println("Odd Number");

        }
    }
}
