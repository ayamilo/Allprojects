package day024;


import java.util.Arrays;

public class TaskOnArray {
    public static void main(String[] args) {
// create an double array of 3 items ; and put 3 value
// get a string representation out of this array and save it as pricesString
// print each and every character in this String  in this format
//  character at index 1 is :  yourCharacterHere
//  character at index 2 is :  yourCharacterHere and so on all the way till last

        double[] prices={3.14,5.5,9.0};
        System.out.println(Arrays.toString(prices));
        System.out.println("Arrays.toString(prices) result "+Arrays.toString(prices));
        String pricesString=Arrays.toString(prices);

        for (int i = 0; i <pricesString.length() ; i++) {
            System.out.println("character at index  " + " is "+ pricesString.charAt(i));


        }

    }
}
