package day016;

public class Count1to10 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter<11){
            System.out.println("counter value is : "+ counter);
            // SOMETHING HAS TO BE DONE TO CHANGE THE CONDITION ALONG THE WAY
            // OR IT JUST KEEPS RUNNING FOREVER
            // SO YOU NEED TO ADD ++COUNTER.
            ++counter;
        }

    }
}
