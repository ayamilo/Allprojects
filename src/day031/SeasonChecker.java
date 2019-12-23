package day031;

public class SeasonChecker {
    public static void main(String[] args) {
        // a String variable declared and assigned value inside main method
        // it can be accessible in main method
        String season ="Winter";
        decideSeasonAction("Winter");
        decideSeasonAction("Summer");
        decideSeasonAction("Fall");
        decideSeasonAction("AAAA");


    }
    /*
    *write a static method called decideSeasonAction
    * it has one String parameter called season
    * Inside method method
    * according to what user passed it should print correct action
    *
    */
    public static void decideSeasonAction(String season){
        // season method parameter can only be accessible inside method body
        switch (season){
            case "Spring":
                System.out.println("Hiking");
                break;


            case "Summer":
                System.out.println("BBQ");
                break;
            case "Fall":
                System.out.println("Picking Pumpkin");
                break;

             case "Winter":
                System.out.println("Coding");
                break;


             default:
                System.out.println("INVALID INPUT");

        }


    }
}
