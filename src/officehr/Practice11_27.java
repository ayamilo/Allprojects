package officehr;

public class Practice11_27 {
    public static void main(String[] args) {
        String message =" A BC";
        // trim ----> take out space at the begining and end of a statement
        // it does not take out space in between characters;
        System.out.println("message = " + message);
        String trimmedMessage=message.trim();
        System.out.println("trimmedMessage = <" + trimmedMessage+ ">");
    }

}
