package day029;

import java.util.Arrays;

public class FillUpStringArray {
    public static void main(String[] args) {
        // create an array with size 300 and fill it up with i love java

        String[] strArr= new String[300];
        //manually
//        strArr[0] = "I Love Java"
        //.............300;

        // automated

        for (int i = 0; i <strArr.length ; i++) {
            strArr[i]=(i+1) + ". I Love Java";


        }
        System.out.println("strArr = " + Arrays.toString( strArr) + " ");


    }
}
