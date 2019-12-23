package day012;

public class CheckingStringEqualityUsingCaseSensitive {
    public static void main(String[] args) {
        String myName="Kamil";
        boolean myNameCorrect=myName.equals("kamil");
        System.out.println(myNameCorrect);
        boolean myNameCorrectIgnoreCase=myName.equalsIgnoreCase("kamil");
        System.out.println(myNameCorrectIgnoreCase);
    }
}
