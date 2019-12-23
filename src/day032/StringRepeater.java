package day032;

public class StringRepeater {
    public static void main(String[] args) {
        /** String repeater
         * this method has 2 parameters
         *     String strToRepeat and int count
         *    repeat printing the string as many time as <count> number define
         *    */
        repeatString("kamil",2);
        repeatString("do not touch",5);

    }
    public static void repeatString(String strToRepeat,int count){
        for (int i = 0; i < count; i++) {
            System.out.println(strToRepeat + "  "  );

        }
    }

    }

