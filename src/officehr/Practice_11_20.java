package officehr;

import java.util.Scanner;

public class Practice_11_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your age ? ");
        int age = scan.nextInt();
        System.out.println("what is your fullname ");
        String fullName = scan.next();
        System.out.println("what is your height ? ");
        double height = scan.nextDouble();
        System.out.println("your name is " + fullName + " "
                + "what is your age is "
                + age);



    }

}
