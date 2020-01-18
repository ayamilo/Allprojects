package day043;

import java.util.ArrayList;
import java.util.List;

public class Starbucks {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        c1.setType("Turkish");
        c1.setCaffeineLevel(8);
        c1.setPrice(4.99);
        System.out.println("c1 = " + c1.toString());// we are calling it at this point
        System.out.println("c1 = " + c1);// if we don't call it compiler will do it for us at this point

        Coffee c2 = new Coffee("Intensity",9);
        System.out.println("c2 = " + c2);

        Coffee c3 = new Coffee("Blonde",5,1.6);
        System.out.println("c3 = " + c3);

        Coffee c4 = new Coffee ("Latte",3,1.0);
        System.out.println("c4 = " + c4);

        double sumOfAllCoffee = c1.getPrice() + c2.getPrice() + c3.getPrice() + c4.getPrice();
        System.out.println("sumOfAllCoffee = " + sumOfAllCoffee);


        //c1 = null ;

//        // any non-primitive type can be assigned to null
//        String str = null ;
//        Scanner scan = null ;
//        Coffee cx = null ;


        List<String> lst = new ArrayList<>();
        lst.add("abc");
        lst.add(null);
        lst.add(null);



    }
}
