package day020;

public class SumOfOdd {
    public static void main(String[] args) {
        // give me the sum of odd numbers from 10-100, use loop
        //hint: create a variable sum as int
        //loop through 10-100
        // in each iteration check it's a even number or not
        // if it's add that number to sum
        // eventually after the loop -----> print out sum value
        int sum = 0;
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 1) {

                //System.out.println(sum );
                sum = sum + i;
            }


        }
        System.out.println("sum= "+sum);
    }
}