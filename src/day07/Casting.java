package day07;

public class Casting {
    public static void main(String[] args) {
        // Type casting: casting is converting one type to another ie Implicitly(automatically)
        // or Explicitly
        //there are two types in java
        // primitive and reference
        // primitive type: char, boolean, int, float,double,byte,long,short
        double bigNum= 10;
        System.out.println(bigNum);
        // 12.99 is double , double has much bigger range than int
        // so it just does not fit
        //int num = 12.99 ; // compiler error!!
        //int num = 12.99; put cursor on int and click on cast into int to fit such that the .99 will be taken out.
        // meaning u dont want .99 run and see the result of print out
        int num = (int) 12.99;
        System.out.println(num);
        int num2= (int) 13.90;
        System.out.println(num2);
/*Casting  is converting one data type and storing into different data type
For example :
10 is int , it can be stored inside double variable
Because double has much bigger range than 10 ,
10 will be converted to 10.0 and stored as double
This called type widening —> smaller data type —>> bigger data type
And this happen automatically/implicitly
12.99 is double , it can not be stored inside int variable
Because int can only hold whole number and has smaller range
  int x = 12.99  —>> COMPILER ERROR!!
In order to save this , we need to specifically tell compiler that
We are ok with potentially losing data (fractional point)
By adding (int) 12.99  —> 12
 int x = (int) 12.99 ;  */


        //task

        // create a long variable and store int
        long earthToMoon= 1000;
        // create an int variable and try to store above long value
        int earthToMoonIn_blabla= (int) earthToMoon;
        System.out.println(earthToMoonIn_blabla);

    }
}
