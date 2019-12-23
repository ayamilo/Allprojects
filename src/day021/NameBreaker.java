package day021;

public class NameBreaker {
    public static void main(String[] args) {
        //Store your name into a variable name
        //loop through each and every letters and print
        // if you see letter l-----> get out of the loop
        //012345678
        String name = "NursuLtan";

        // get out when you see letter l from the loop

        for (int x = 0; x < name.length(); x++) {

            char currentChar = name.charAt(x);


            if (currentChar == 'l' || currentChar == 'L') {
                System.out.println("FOUND IT !!!!!");
                break;
            }

            System.out.println(currentChar);

        }

        for (int x = 0; x < name.length(); x++) {

            String currentChar = name.substring(x, x + 1);

            if (currentChar.equalsIgnoreCase("l")) {
                System.out.println("FOUND IT !!");
                break;
            }
            System.out.println(currentChar);

        }

        // OPTIONALLY CHAIN THE METHOD WITHOUT SAVING EACH CHAR
        for (int x = 0; x < name.length(); x++) {

            if (name.substring(x, x + 1).equalsIgnoreCase("l")) {
                System.out.println("FOUND IT !!");
                break;
            }
            System.out.println(name.substring(x, x + 1));

        }
    }
}