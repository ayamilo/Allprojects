package day059;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {
    public static void main(String[] args) {


    String name = "Furkan";
        System.out.println(" number 100 char of name is "+ name.charAt(1));
    //Exceptions are objects , so it has it's own class
    // and we can create object ourselves just like we did from any other classes
    //  StringIndexOutOfBoundsException e1= new StringIndexOutOfBoundsException();
    //    System.out.println( e1.toString() );
    Scanner scan=new Scanner(System.in);
        System.out.println(" character at what index you want to get Furkan's name ? ");


        try{
            int targetIndex = scan.nextInt();
        System.out.println(name.charAt(targetIndex));

    }catch (StringIndexOutOfBoundsException e){

        System.out.println(" message from getMessage method : " + e.getMessage());
        System.out.println("Something unusual happened");
            System.out.println("Enter number between 0 and " + name.length());
    }catch(InputMismatchException al){
            System.out.println("Input Mismatch; Enter number" +al.getMessage());
        }catch (Exception e){
            System.out.println(" if i dont catch the above two i come here ");

        }
        System.out.println("THE END ");



}
}
