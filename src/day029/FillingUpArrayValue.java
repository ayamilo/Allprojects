package day029;

import java.util.Arrays;

public class FillingUpArrayValue {
    public static void main(String[] args) {
        // create an array with size 100 and fill it up as below


        int[] numbers = new int[100];
        System.out.println("Before filling up " + Arrays.toString(numbers));
        //manually imputing:
        //  numbers[0]= 1;
        //  numbers[1]= 2;
        //  numbers[2]= 3;
        //...........;
        //numbers[99]= 100;
        // automated
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;

        }
        System.out.println("after filling up " + Arrays.toString(numbers));


        // fill it out with even numbers starting from 0
        // this is what we do manually. is what we do without loop
        //numbers[0]=0; 0*0
        // numbers[1]=2;1*2
        // numbers[2]=4;2*2
        // numbers[3]=6;3*2
        //numbers[4]=8;4*2
        //............;
        //numbers[99]=198;99*2

        // automatically

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=i*2;

        }
        System.out.println("after filling up default " + Arrays.toString(numbers));


    }
}
