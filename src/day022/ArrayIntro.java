package day022;

public class ArrayIntro {
    public static void main(String[] args) {
        // syntax for creating variable and assigning value
        // dataType variableName=value
        int num1 = 10;
        System.out.println("num1 =" + num1);
        //IN ARRAY
        // syntax for creating variable to store multiple items
        // and assign a values
        //datatype[]variableName=new dataType[count of item]
        //this array can hold 4 times, it's known as array size

        //creating array object with empty slot
        int[] scores = new int[4];
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;
        //accessing the elements inside array one by one
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        //updating the value at certain index
        scores[1] = 99;
        // then print it out
        System.out.println(scores[1]);



    }




}
