package day05;

public class VariablePractice {
    public static void main(String[] args) {
        //8 primitive data type
        /*
        block comment(/*) everything in between will be seen as comment
        whole numbers    : byte, short, int, double
        fractional numbers: float, double
        logical            : boolean(true, false)
        character           : char ( single character in single quote

        usually by default for whole numbers : just use int
        usually by default for fractional numbers : just use double

        Is string part of primitive types?  noo
         */
        //Task1: age calculator
        //given birth year, please calculate the age
        // solve
        int birthYear = 2001;
        int currentYear = 2019;
        int age = (currentYear - birthYear);
        // i was born in 2001, and i am 18 years old;
        //System.out.println( "i was born in year "+ 2001 ", and I am " (2019-2001)+ "years");
        System.out.println("I was born in year " + birthYear + " , and i am " + age + " years old");

        // task 2: you are speeding today
        // speed limit is some number , and your current speed is this
        // generate this output of: you are driving 10mph morethan speed limit
        // speedLimit as int, currentSpeed as int , overThelimit as int
        int speedLimit= 55;
        int currentSpeed = 65;
        int overThelimit = currentSpeed -speedLimit;
        System.out.println("i am speeding at  " + currentSpeed + " mph the speed limit is  " + speedLimit + " mph,i am therefore over speeding  " + overThelimit + " mph");
    }


}
