package day018;

import java.util.Scanner;

public class GiveMe5$20$ {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("please give me 5 or 20");
        int x=scan.nextInt();

        // keep asking for 5$ or 20$ until you get them
        //int x = 0;
        while (x!=5 && x!=20){
            System.out.println(" NOT THE BILL IAM LOOKING FOR ");
            System.out.println("please give me 5 or 20");
            x=scan.nextInt();

        }
        System.out.println("THE HAPPY ENDING !! GOT THE MONEY");
    }
}
