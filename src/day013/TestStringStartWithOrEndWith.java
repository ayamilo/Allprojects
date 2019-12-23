package day013;

public class TestStringStartWithOrEndWith {
    public static void main(String[] args) {
        String name="kamil";
        //check if a string start with another string
        // is case sensitive
        System.out.println(name.startsWith("ka"));
        System.out.println(name.startsWith("Ka"));
        System.out.println(name.startsWith("Kal"));

        // check if a string end with another string
        System.out.println(name.endsWith("l"));
        System.out.println(name.endsWith("k"));
        System.out.println(name.endsWith("L"));


    }
}
