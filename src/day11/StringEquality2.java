package day11;

public class StringEquality2 {
    public static void main(String[] args) {
        // create a variable called myStr and assign a value
        // check whether myStr value is java
        //if true ----> correct word!!!!!
        // if false ----> say Java
        String myStr = "Java";
        if (myStr.equals("java")) {
            System.out.println("correct word");

        } else {
            System.out.println("say java");
        }
    }
}