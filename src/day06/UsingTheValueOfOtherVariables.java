package day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {
        int myFavoriteNumber= 300;
                int yourFavoriteNumber= myFavoriteNumber;
        System.out.println("My favorite number " + myFavoriteNumber);
        System.out.println("Your Favorrite Number " +yourFavoriteNumber);
        yourFavoriteNumber = 100;
        System.out.println("My Favorite number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " +yourFavoriteNumber);
        //create a variable called yourOrder , type String and assign a value
        // create another variable called myOrder and assign the value
        // and just print them out.
        String yourOrder = "chickensalad";
        String  myOrder = yourOrder;
        System.out.println(" your order is: " + yourOrder);
        System.out.println("my order is " + myOrder);


    }
}
