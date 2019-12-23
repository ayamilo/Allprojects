package day014;

public class LastIndexOf {
    public static void main(String[] args) {
        String name= "Game of Java";
        // find out last location the letter a shows up
        System.out.println("find out last location the letter a shows up");
        System.out.println(name.lastIndexOf("a"));
        // find out last location of space
        System.out.println("find out last location of space");
        System.out.println(name.lastIndexOf(" "));
        // find out the last location of the letter Ga shows up
        System.out.println("find out the last location of the letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));
        // find out the last location of kawa
        System.out.println("find out the last location of kawa");
        System.out.println(name.lastIndexOf("kawa"));


    }
}
