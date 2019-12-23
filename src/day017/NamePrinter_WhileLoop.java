package day017;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {
        //Alexander
        String name="kamil";
        int x=0;
        while (x<name.length()){
            System.out.print("index "+ x + " : ");
            System.out.println(name.charAt(x));
            ++x;
        }
    }
}
