package personalpractice;


import java.util.Arrays;

public class Mohammmed {
    public static void main(String[] args) {
        /* countDownByEvenNumberFrom50to0
         * * create a method that has no parameter
         * and count Down By Even Number From 50 to 0
         * for example 50 , 48 , 46 .....0
         */
        countDownByEvenNumberFrom50to0();

        }
public static void countDownByEvenNumberFrom50to0(){
    for (int i =50; i >=0 ; i--) {
        if(i%2==0) {
            System.out.print(i+" ");
        }

    }
}


    }



