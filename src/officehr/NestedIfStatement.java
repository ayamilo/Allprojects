package officehr;

public class NestedIfStatement {
    public static void main(String[] args) {
        //you have the option to buy food or drink
        //under food you can buy meal or snacks
        //under the drink you can buy soda or juice
        // if your selection is food: what kind do you want? meal or snack
        // if your selection is drink: what kind do you want? soda or juice
        String mainOptions = "food";
        String secondaryOption = "meal";
        if (mainOptions.equalsIgnoreCase("food")) {
            System.out.println("you have selected food");
            if (secondaryOption.equalsIgnoreCase("snack")) {
                System.out.println("you have selected snack");
            } else if (secondaryOption.equalsIgnoreCase("meal")) {
                System.out.println("you have selected meal");
            }

        } else {
            System.out.println("no such food option");


        }

    }
}