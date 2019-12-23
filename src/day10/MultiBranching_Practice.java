package day10;

public class MultiBranching_Practice {
    public static void main(String[] args) {
        //at macDonald Drive through
        System.out.println("welcome to MacDonald, what can i help you");
        /*
        *11, burger
        * 5, french Fry
        * 8, nuggets
        * 35, Ice Cream
        * 55, Coke
         */
        String order= "";
        int itemNumber =5;
        if(itemNumber==11){
            System.out.println("you have selected 11 ");
            order="burger";

        }else if (itemNumber==5) {
            System.out.println("you have selected 5");
            order = "french fry";
        }else if(itemNumber==8){
            System.out.println("you have selected 8");
            order="nugget";
        }else if (itemNumber==35){
            System.out.println("you have selected 35");
            order="ice cream";
        }else{
            System.out.println("you have selected unknown");
            order="unknown";
        }
        System.out.println("your order is " + order);
    }
}
