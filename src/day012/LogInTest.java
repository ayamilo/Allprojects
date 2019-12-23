package day012;

public class LogInTest {
    public static void main(String[] args) {
        //create a class called LogIn
        // Note to get the result keep changing username or password to get the output
        String userName = "Ayamilo", passWord="pass1234";

        if (userName.equals("ayamilo") && passWord.equals("pass1234")) {
            System.out.println("log in successful");

        }else if(!userName.equals("ayamilo") && passWord.equals("pass1234")) {
            System.out.println("user name not correct");

        }else if (userName.equals("ayamilo") && !passWord.equals("pass1234")){
            System.out.println("pass word not correct");
        }else{
            System.out.println("pass word and user name incorrect");


        }
    }
}
