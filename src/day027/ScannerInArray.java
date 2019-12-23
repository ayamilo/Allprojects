package day027;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerInArray {
    public static void main(String[] args) {
        //Task 01: write a program that asks user to enter a number 5 times,
        // and store those number into array

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            System.out.println("ENTER AN INT NUMBER : ");
            numbers[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));


    }
}
