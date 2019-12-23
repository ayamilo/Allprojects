package day031;

public class Voting {
    public static void main(String[] args) {
        checkEligibility(15);
        checkEligibility(34);
        checkEligibility(45);
        checkEligibility(12);
        checkEligibility(85);

    }
    public static void checkEligibility(int age){

       // int age = 15;
                if(age>18){
                    System.out.println("you are eligible to vote");

                }else{
                    System.out.println("you are not eligible to vote");
                }
    }
}
