package day05;

import java.util.Scanner;
public class GroceryActions {
    public static void main(String[] args) {
        /*   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
                You got 5 potato price is 3.49 and total -->>
                You got 2 banana price is 1.99 and total -->>

                Your grand total for this shopping is ????*/

Scanner scan= new Scanner(System.in);
double priceOfTomatoes=3.55;
int tomatoCount= 4;
double totalPrice=tomatoCount*priceOfTomatoes;


        System.out.println("what is the count of tomato : ");
        scan.nextInt();
        System.out.println("what is the price of tomato: " );
        scan.nextDouble();
        System.out.println("the total price of tomato :  " +totalPrice);







    }
}
