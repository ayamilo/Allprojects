package day021;

public class WarmUpTask {
    public static void main(String[] args) {
        // given your name store it in a variable myName as string
        // for example: "my name is YourName here":
        // 1, loop through each and every character print them out like this:
        // M->y-> >n->a->m->e and so on put arrow in between the character.
        //Optionally
        // 2 , print the sentence by 2 character at a time
        // 		just by incrementing by 1
        // 3 , print the sentence by 3 character at a time
        // 4 , print the sentence by 4 character at a time
        String myName="my name is kamil";
        int charCount=myName.length();
        int lastCharIndexOf=charCount-1;

        System.out.println("----for 1 char----");
        for (int x = 0; x <=lastCharIndexOf ; x++) {
            System.out.print(myName.substring(x,x+1) + "->");
        }
        System.out.println("------");
        System.out.println("----for2char----");
        for (int x = 0; x <lastCharIndexOf-1 ; x++) {
            String twoChar=myName.substring(x,x+2);
            System.out.print(twoChar + "->");

        }
        System.out.println("-----");
        System.out.println("----for3char-----");
        for (int x = 0; x <=lastCharIndexOf-2 ; x++) {
            String threeChar=myName.substring(x,x+3);
            System.out.print(threeChar+ "->");

        }
    }
}
