package day063;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class FindingCharacterShowedUpAtLeastOnce {
    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        // how many unique (non-repeating) character showed up in the above sentence
        // Basically we are looking for all the non- repeating character to make up this sentence
        // for example if you have AAABBC-----> the result is ABC

        //ONE WAY TO DO IT
        // first find a data structure that automatically remove duplicate ( create a HashSet object with type Character)
        // iterate over each character in above String
        // then add it to the object (HashSet) so it can remove the

        Set<Character> charset= new HashSet<>();
        for (int x = 0; x <str.length() ; x++) {
            charset.add(str.charAt(x));

        }
        System.out.println("how many character over all " + str.length());
        System.out.println("how many unique characters? " +charset.size());
        System.out.println("charSet "+ charset);

        for (Character eachChar: charset) {
            System.out.println("each unique cahracter = " +eachChar );

        }

    }
}
