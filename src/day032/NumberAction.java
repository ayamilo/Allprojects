package day032;

public class NumberAction {
    public static void main(String[] args) {
/**
 * Create static void methods as below
 *
 * numberComparision
 * this method has 2 parameters called num1 and num2
 * if num1 is more than num2 print num1 is more than num2
 * if num2 is more than num1 print num2 is more than num1
 * if num2 are equals num1 print they are equal
 *
 * String repeater
 * this method has 2 parameters
 *     String strToRepeat and int count
 *    repeat printing the string as many time as <count> number define
 *
 * skipCountBy3From0to50
 *
 * * create a method that has no parameter
 * and skip count by 3 from 0 to 50
 *
 * countDownByEvenNumberFrom50to0
 * * create a method that has no parameter
 * and count Down By Even Number From 50 to 0
 * for example 50 , 48 , 46 .....0
 *
 * print1toX
 * * create a method that has 1 int parameter called x
 * print from 1 to that number in one line
 * print an empty line after the print.
 *
 *
 */
//int num1=40;
//int num2=30;
        numberComparison(20,40);
        numberComparison(70,9);
        numberComparison(16,16);




    }
public static void numberComparison(int num1, int num2){
    if(num1>num2){
        System.out.println("num1 is more than num2");
    }else if(num2>num1){
        System.out.println("num2 is more than num1");
    }else{
        System.out.println("they are equal");

        }

    }
}
