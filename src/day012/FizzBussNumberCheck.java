package day012;

public class FizzBussNumberCheck {
    public static void main(String[] args) {


        // create a class called FizzBuzzNumberCheck with main method
        // Given a number , create a variable int num
        //given a number
        //if this number can be divided by 5 without remainder lets print it Fizz number
        //for example 5,15,25,100
        //if this number can be divided by 3 without remainder lets print it Buzz number
        // for example 3,15,9,27
        //if this number can be divided by both 3 and 5 lets print FizzBuzz Number
        // for example 15, 45,30,90
        //
        int num = 10;
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("This is FizzFuzz Number");
        } else if (num % 3 == 0) {
            System.out.println("This is Fuzz Number ");
        } else if (num % 5 == 0) {
            System.out.println("This is Fizz Number");
        }
    }
}