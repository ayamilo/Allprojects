package day014;

public class EmailChecker {
    public static void main(String[] args) {
        /*create a variable called email
                check for below conditions
                if it does not contain character @ say invalid email
                if it contains space say invalid email
                if it endswith @gmail.com----> gmail
                if it endswith @yahooo.com---> yahoo mail
                if it endswith @mail.ru-----> russian email.*/
        String email = "ayamilo2000@gmail.com";

        if (!email.contains("@")) {
            System.out.println("email is invalid");
//line 14 and 17 can be written together. if (!email.contains("@")) || email.contains(" "))
    }else if(email.contains(" ")){
            System.out.println("invalid email");
        }else if(email.endsWith("@gmail.com")){
            System.out.println("google mail");
        }else if(email.contains("@yahoo.com")){
            System.out.println("yahoo mail");

        }else if(email.contains("@mail.ru")){
            System.out.println("russian mail");
        }


    }
}
