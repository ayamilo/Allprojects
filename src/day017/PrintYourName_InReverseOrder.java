package day017;

public class PrintYourName_InReverseOrder {
    public static void main(String[] args) {
        String name="kamil";
        int x= name.length()-1;
        while (x >=0){
            System.out.println("index "+ x + " :" + name.charAt(x));

            --x;
        }
    }
}
