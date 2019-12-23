package day032;

public class Print1toX {
    public static void main(String[] args) {
        /*print1toX
         * * create a method that has 1 int parameter called x
         * print from 1 to that number in one line
         * print an empty line after the print.
         */
        print1toX(9);
        print1toX(5);

    }
    public static void print1toX(int x) {

        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

