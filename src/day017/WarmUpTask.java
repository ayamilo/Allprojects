package day017;


public class WarmUpTask {
    public static void main(String[] args) {
        // create a String variable to Store your name in any case combination
        // for example kaMil
        // create a variable called name2
        // make your first letter uppercase then the rest lower case
        // optionally ask your name from Scanner
        // optionally ask your full name
        // then make your full name first letter uppercase the rest lowercase
        //01234567
        String name = "kHumAyRa";

        // substring method copy the part of String inside another String
        // it has 2 version :
        // 1,  start with certain index and end at ending index
        // 2,  start with certain index then get the rest of the String

        // get the first character -->> make it uppercase
        // get the rest of the characters starting from 2nd character
        /// then make it lowercase
        //  eventually concatenate them
//         String nameFixed = (name.charAt(0)+"").toUpperCase() ;
//                nameFixed = nameFixed + name.substring(1).toLowerCase();

        String nameFixed = name.toUpperCase().substring(0, 1);
        nameFixed += name.substring(1).toLowerCase();

        System.out.println("nameFixed = " + nameFixed);

        // make whole name uppercase the get the first character
        // get the rest of the characters starting from 2nd character
        /// then make it lowercase
        //  eventually concatenate them







    }
}
