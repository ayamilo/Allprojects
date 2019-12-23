package day07;

public class IncrementAndDecrementByOne {
    public static void main(String[] args) {
        // increment by one
        int apple = 10;
        apple = apple + 1;
        apple +=1;
        ++apple;
        System.out.println(apple);
        // create two variable for first name and last name, company
        // create another variable for email
        // create email in this format firstName_lastName@company.com
        // print out the result as, my name is <your full name> and i work for <company> and my email is <email>
String firstName="kamil";
String lastName="husein";
String company="google";
String email="@gmail.com";
        System.out.println("my first name is : " + firstName+ ". "+ "my last name is  " + lastName  +". "+" the company i am working for is "+ company + " . "+ " my eamil is  "+ firstName+"_"+lastName+email);
int orange= 12;
//++orange;
//orange++;
orange+=2;
        System.out.println(orange);

        //decrement:
        int banana= 10;
        --banana;
        System.out.println(banana);
    }
}
