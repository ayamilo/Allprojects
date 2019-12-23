package officehr;

public class LogInTest {
    public static void main(String[] args) {
        String userName="user123", password="pass123";

        if(userName.equals("user123") && password.equals("pass123")){
            System.out.println("Login successful");
        }
        else if(!userName.equals("user123") && password.equals("pass123")){
            System.out.println("Username NOT CORRECT");
        }
        else if(userName.equals("user123") && !password.equals("pass123")){
            System.out.println("Password NOT CORRECT");
        }
        else{
            System.out.println("Username and password WRONG");
        }
    }
}
