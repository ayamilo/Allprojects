package officehr;
class Test {

    public Test() {
        //  this();
        //  this("Sumeyye");
        System.out.println("Hola");
    }

    public Test(String str) {
        //  this();
        System.out.println(str);
    }

    public Test(int a) {
        //  Test();
        // System.out.println("hello");
        this(); // Hola
        //     this("Muge");

        System.out.println("hello");
    }

    public static void main(String[] args) {
        Test obj = new Test(10);
    }


}

public class This_Keyword {

}
