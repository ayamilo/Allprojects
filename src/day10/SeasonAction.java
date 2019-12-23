package day10;

public class SeasonAction {
    public static void main(String[] args) {
        /* what do u do in each season
        *spring -----> hike! Easter, blossom
        * summer----->swim,vacation,BBQ,holiday
        * fall------>black friday,hiking,harvest,halloween,shopping
        * winter---->snowboarding,ski,christmas,new year
         */
        String season="spring";
        // the data types used is switch are byte,short,int,char,string
        switch(season){
            case"spring":
                System.out.println("hike,blossom");
                break;
            case"summer":
                System.out.println("vacation,swim");
                break;
            case "fall":
                System.out.println("black friday,hiking,harvest");
                break;
            case "winter":
                System.out.println("snowboarding,ski,christmas");
                break;
        }

    }
}
