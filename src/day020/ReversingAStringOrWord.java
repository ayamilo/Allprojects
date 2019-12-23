package day020;

public class ReversingAStringOrWord {
    public static void main(String[] args) {
        // given a string variable name with value
        // reverse this name and store reverse value into
        // another String variable reversedName
                   //01234567
        String name="Jon Snow";
        String reversedName;

        System.out.print(name.charAt(7));
        System.out.print(name.charAt(6));
        System.out.print(name.charAt(5));
        System.out.print(name.charAt(4));
        System.out.print(name.charAt(3));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(0));

        System.out.println();
        for (int x = 7; x >=0 ; x--) {
            System.out.print(x + " index : ");
            System.out.println(name.charAt(x));

        }
    }
}
