package officehr;

public class StringReview {
    public static void main(String[] args) {
        String str="i like Pumpkin";
        //System.out.println(str.equals("pumpkin"));

        
        // contains:
        // it check whether a string exist in another string
        System.out.println("does it contain Pumpkin : ");
        System.out.println(str.contains("Pumpkin"));

        boolean gotPumpkin=str.contains("Pumpkin");
        // short cut to print variable value in nice format soutv+tab;
        System.out.println("gotPumpkin = " + gotPumpkin);
        // startWith  endsWith
        //check whether a string start with another string
        // check whether a string end with another string
        //and return true or false result
        boolean startedWithI=str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);
        boolean endWithPumpkin=str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);


    }

}
