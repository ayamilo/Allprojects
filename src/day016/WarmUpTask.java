package day016;

import java.security.SecureRandom;

public class WarmUpTask {
    public static void main(String[] args) {
        /* given a word with 4 characters
        store in a String variable word1
        create a String variable called word2
        store the reverse word1 into word2
        and print out
        Example
        word1===> java....----->word2. avaj
        optionanally ask this word from scanner.
         */
        String word1="Java";
        String word2="";

        char letter1word1=(0);
        char letter2word1=(1);
        char letter3word1=(2);
        char letter4word1=(3);
       word2="" +word1.charAt(3) +word1.charAt(2)+word1.charAt(1)+word1.charAt(0);

        System.out.println("word2 = "+word2);


    }
}
