package day018;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        // smart lock door has password
        // unless you enter correct password
        // it keep locking you out
        // assuming correct password is B15
        // keep  asking until user enter correct password
        Scanner scan=new Scanner(System.in);
        System.out.println("KNOCK KNOCK");
        System.out.println("WHAT'S THE PASSWORD");
        String password=scan.next();

        while (!password.equals("B15")){
            System.out.println("WRONG PASSWORD!! TRY AGAIN");
            password=scan.next();
        }
        System.out.println("OPEN SUCCESSFULLY!!! HURRAY");
    }
}
