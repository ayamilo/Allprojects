package day012;

public class CheckingStringEqualityUsingCaseSensitive {
    public static void main(String[] args) {
        String myName="Kamil";
        boolean myNameCorrect=myName.equals("kamil");
        System.out.println(myNameCorrect);
        boolean myNameCorrectIgnoreCase=myName.equalsIgnoreCase("kamil");
        System.out.println(myNameCorrectIgnoreCase);
        String name="mohammed";
        boolean nameEquality=name.equals("Mohammed");
        System.out.println(nameEquality);
        boolean nameEqualityIgnoreCase=name.equalsIgnoreCase("Mohammed");
        System.out.println(myNameCorrectIgnoreCase);
    }
}
