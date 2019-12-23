package day014;

public class IndexOfPractice {
    public static void main(String[] args) {
        // indexOf
        // find out index of another string inside this String
        String name= "Game of Java";// length is 12,last char index is 11
        // find out the location of Java
        // find out the location of letter o
        //find out the location of first space
        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("o"));
        System.out.println(name.indexOf(" "));
        //location of a number not found will give you minus number
        System.out.println("find out the location of uppercase'A'");
        System.out.println(name.indexOf("A"));
    }
}
