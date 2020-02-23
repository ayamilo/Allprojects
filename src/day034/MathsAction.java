package day034;

import day031.Calculator_V2;

import java.util.Arrays;

public class MathsAction {
    public static void main(String[] args) {
        // calling the static methods of other class
        //build3DigitNumber is under day034 package
        //and inside PracticeMethodWithNumbers class
        int result1 = PracticeMethodWithNumbers.build3DigitNumber(6, 4, 0);
        System.out.println("result1 = " + result1);
        // in order to use Arrays class
        // that is coming from java.util package(NOT YOUR PACKAGE
        // First we need to import them import java.util.Arrays;
        // in order to use classname.methodName(...);
        // here Arrays.toString(your array objects goes here)
        int[] nums ={2,5,87};
        System.out.println("nums = " + Arrays.toString( nums));
        //how can i call static method called in SimpleCalculator in Calculator_V2 under day31 package
        // first thing first, its not under current package day34
        // so we need to import the class -----> import day31.calculate_V
        // in order to call static method of Calculator_V2 class ,
        //  Calculator_V2.yourStaticMethodName(....)
          Calculator_V2.calculate(10, 20, '-');

    }
}
