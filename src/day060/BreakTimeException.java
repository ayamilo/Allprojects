package day060;

public class BreakTimeException extends RuntimeException {

}

class Main {
    public static void main(String[] args) {


        throw new BreakTimeException();
    }
}