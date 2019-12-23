package day10;



public class Answer {
    public static void main(String[] args) {
        String myAswer="";
        int myNumber =10 ;
        if (myNumber % 5==0){
            myAswer = "fizz Number";

        }else {
            myAswer = "not fizz Number";
        }
        System.out.println("print my number is " + myNumber + " , it is " + myAswer);



    }
}
