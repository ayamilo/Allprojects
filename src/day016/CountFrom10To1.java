package day016;

public class CountFrom10To1 {
    public static void main(String[] args) {
        // i want to start with 10, and decrease the value by one
        // so i can get out of the loop

        int count = 10;

        while( count>=1  ){
            System.out.println(count);
            --count;
        }
    }
}
