package day027;

public class OverloadingPractice {
    public static void main(String[] args) {
        /*Create a class called OverloadingPractice
create 4 static void overloaded version of add method
	1, add
		has 1 int parameter and add 100 to that number
		and print out the result
	2, add
		has 2 int parameters and add them to get sum
		and print out the result
	3, add
		has 3 int parameters and add them to get sum
		and print out the result
	4, add
		has 2 long parameters and add them to get sum
		and print out the result
        * */

        add(24);
        add(40,20);
        add(20,30,40);
        add(40l,20l);
//    }
//    public static void add(int num1){
//        System.out.println(num1+100);
//    }
//    public static void add(int num2,int num3){
//        System.out.println(num2+num3);
//
//    }
//    public static void add(int num4,int num5,int num6){
//        System.out.println(num4+num5+num6);
//    }
//    public static void add(long num7,long num8){
//        System.out.println(num7+num8);
//    }
        add(15);
        add(15, 45);
        add(15, 43, 67);
        add(15L, 23L);

    }

    public static void add(int a, int b) {
        System.out.println(a + b + "  calling add(int a, int b) ");
    }

    public static void add(int a) {
        // DO I ALREADY HAVE A METHOD THAT ADD 2 NUMBERS
        System.out.println(a + 100 + "  calling add(int i) ");
        //add(a,100); // we can do this to reuse functionality we already have
    }

    public static void add(long a, long b) {
        System.out.println(a + b + "  calling add(long a, long b)");
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c + "  calling add(int a, int b, int c) ");
    }

}
