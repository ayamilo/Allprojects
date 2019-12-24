package day033;

public class MethodWithReturnPractice2 {
    public static void main(String[] args) {

        /**
         * build_GOT_Email
         * This method should build email using user's first and last name
         * for example Jon Snow --->> JSnow@NightWatch.com
         * @param firstName user's first name
         * @param lastName  user's last name
         * @return the email created using
         * firstName initial + lastName + @NightWatch.com
         */
        //String firstName="kamil";
        //String lastName="husein";
       // String email=firstName.charAt(0)+lastName+"@NightWatch.com";
       // System.out.println(email);
        System.out.println( build_GOT_Email("kamil","husein"));


    }
    public static String build_GOT_Email(String firstName, String lastName ){
        String email=firstName.charAt(0)+lastName+"@NightWatch.com";
        return email;
    }
}