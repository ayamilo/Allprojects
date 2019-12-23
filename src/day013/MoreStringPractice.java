package day013;

public class MoreStringPractice {
    public static void main(String[] args) {
        String name = "Akbar";
        System.out.println(name);
        //name = "Bullet";
        //System.out.println(name );
        //String is immutable, once created it can not be change
        //any string / methods that looks like changing the value
        name.toUpperCase();
        System.out.println(name);
        System.out.println(name.toUpperCase());
        //what if i really want to change the name
        name=name.toUpperCase();
        System.out.println(name);
    }
}
