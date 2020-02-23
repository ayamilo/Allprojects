package day059;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        String name = "Furkan";
        System.out.println(" number 100 char of name is "+ name.charAt(1));
         //Exceptions are objects , so it has it's own class
        // and we can create object ourselves just like we did from any other classes
       //  StringIndexOutOfBoundsException e1= new StringIndexOutOfBoundsException();
      //    System.out.println( e1.toString() );
        Scanner scan=new Scanner(System.in);
        System.out.println(" character at what index you want to get Furkan's name ? ");
        int targetIndex = scan.nextInt();

        try{
            System.out.println(name.charAt(targetIndex));
            // catch (Exception e) {this is a general catch block that can catch any
            // exception IS-A sub type of Exception
            //below will narrow the catch block to
            // only catch StringIndexOutOfBoundException and take action accordingly
        }catch (Exception e){
            // getMessage is a method coming from Exception class and provide
            // some more details about exception object
            System.out.println(" message from getMessage method : " + e.getMessage());
            System.out.println("Something unusual happened");
        }
        System.out.println("THE END ");
        // Exceptions are object , so it has it's own class
        // and we can create object ourselves just like we did from any other classes
        //  StringIndexOutOfBoundsException e1= new StringIndexOutOfBoundsException();
        //StringIndexOutOfBoundException e.toString()


    }
}
