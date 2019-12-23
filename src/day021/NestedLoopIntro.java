package day021;

public class NestedLoopIntro {
    public static void main(String[] args) {
        //count from 1  to 5
        //repeat this 3 times
        //        for (int x = 1; x <= 5; x++) {
//            System.out.print( x + " " );
//        }
//        System.out.println();
//
//        for (int x = 1; x <= 5; x++) {
//            System.out.print( x + " " );
//        }
//        System.out.println();
//
//        for (int x = 1; x <= 5; x++) {
//            System.out.print( x + " " );
//        }
//        System.out.println();
        //THE BEST WAY TO DO IT IS BELOW:


        for (int i = 1; i <=5 ; i++) {
            System.out.println("ITERATION : "+i);
            for (int x = 1; x <=5 ; x++) {
                System.out.print(x+" ");

            }
            System.out.println();


        }
        //count from 1  to 10----> print only odd numbers
        //repeat this 4 times
        for (int i = 1; i <=4 ; i++) {

                System.out.println("ITERATION :"+i);
            for (int y = 1; y <10 ; y++) {
                if(y%2==1){
                    System.out.print(y + " --");
                }

            }
            System.out.println( );
            }

        }
    }

