package day11;

public class LogicalNotOperator {
    public static void main(String[] args) {
        // logical not operator  ! exclamation mark used to negate the boolean
        // it cannot be used for any other data type other than boolean
        System.out.println(true);
        System.out.println(false);
        System.out.println(!true);
        System.out.println(!false);
        boolean isRecording= false;
        System.out.println("result of ! isRecording ----->");
        System.out.println(! isRecording);
        // third you can use it infront of boolean expression
        //boolean expression is any expression that result in a boolean value
        // for example 7>5 , x>10 , y==20 , x<=100 , x>y , x>10 && x<100
        System.out.println("result of !(7>5) is " );
        System.out.println( !(7>5));

        int x = 7 ;
        System.out.println("the result of (x>10) is ");
        System.out.println(x>10);
        System.out.println(" result of ! (x>10)");
        System.out.println(!(x>10));
    }
}
