package day019;

public class ForLoopStairCase {
    public static void main(String[] args) {
        String star = "";
        for (int i = 1; i <= 20; ++i) {
            star = star + "*";
            System.out.println(i + " " + star);

        }
    }
}