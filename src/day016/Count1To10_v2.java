package day016;

public class Count1To10_v2 {
    public static void main(String[] args) {
        int counter= 1;
        while (counter<=10){
            //++ counter----->counter=counter+1

          //  System.out.println(++counter);  ------>> this will print out upto 11 it adds to 1
            //  immediately
            System.out.println(counter++);// this will increase next time counter appears

        }
    }
}
