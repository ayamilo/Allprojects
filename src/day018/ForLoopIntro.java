package day018;

public class ForLoopIntro {
    public static void main(String[] args) {
        // count 1 to 5
        // for loop () has 3 parts separated by;
        // first part initialization
             //it will run only once when you enter the loop
        //second part termination condition
              // loop will stop if it is safe
              // it will check every time
        // third part increment or decrement to change every time
        // it will run after each iteration
        for(int count=1 ; count<=5 ;count++){
            System.out.print("count = " + count);
            System.out.println(" HAPPY BIRTHDAY \"Ayamilo\"");
        }
        // counting from 10 to 1
        for (int counter = 10; counter>0 ; counter--){
            System.out.println("counter = " + counter);
        }

        // count even numbers from 1 to 100
        for(int num = 0; num<=30; num+=2){
            System.out.print("num = " + num);
            System.out.println(" EVEN NUMBER");
        }
    }
}
