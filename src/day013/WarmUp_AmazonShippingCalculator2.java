package day013;

public class WarmUp_AmazonShippingCalculator2 {
    public static void main(String[] args) {
        // create a boolean store the result of doYouWanToShop
        // if yes, do you want to go to store or do you wanna shop online
        // if user do not want to shop at all, print good job stay home coding
        boolean youWantToShop = true;
        String preference = "store" ;
        //if(youWantToShop )

        if( youWantToShop == true  ) {
            if( preference.equals("Store" ) ){
                System.out.println("GOING TO STORE FOR SHOPPING");
            }else {
                System.out.println("GOING TO ONLINE FOR SHOPPING");
            }
            // line 13 t0 16 belong to the first if. first if is pregnant with 13 to 17
            // it is called NESTED IF STATEMENT
        }else {
            System.out.println("good job stay home coding !!!!");
        }
    }
}
