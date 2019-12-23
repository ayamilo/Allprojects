package day03;

import java.security.SecureRandom;

public class primitivespractice {
    public static void main(String[] args) {


        int catCount=20 ;
        System.out.println("cat count is " +catCount);
        byte letterCount=26;

        short sheepCount=300;

        long mileToSun=1000000l;

        long mileTomoon=5000000L;

        // ---------floating point---------
        // u must add f at the end of number to indicate this is the float data type
        //upper case or lower does not matter, but its mandatory

        float priceOfbanana= 1.99f;

        float priceOfPotato=2.49F;

        //---------larger float point numbers--------

        double priceOfIpad1 = 355.99d;

        double priceOfIpadPro = 1024.99D;

        //compiler automatically assume its a double

        double priceOfMac = 2299.99;



        System.out.println("Macbook cost as much as " + priceOfMac);
        System.out.println("cost of ipadPro " + priceOfIpadPro);



    }
}
