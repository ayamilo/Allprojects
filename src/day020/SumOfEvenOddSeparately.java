package day020;

public class SumOfEvenOddSeparately {
    public static void main(String[] args) {
        //  Give me the sum of odd numbers and even numbers from
//  10 - 100 , use for loop
//// hint : create a variable sumOfOdd and sumOfEven as int
/// loop through 10-100
////  in each iteration check it's a even number or not
////    if it's add that number to sumOfEven
//        if not add that number to sumOfOdd
//
//    eventually after the loop -->> print out sum value
        int sumOfEven=0;
        int sumOfOdd=0;
        for (int i = 10; i <=100 ; i++) {
            if(i%2==0){
                sumOfEven=sumOfEven+i;
            }else {
                sumOfOdd=sumOfOdd+i;

            }

        }
        System.out.println("sum of even number= "+sumOfEven);
        System.out.println("sum of odd number= "+ sumOfOdd);
    }
}
