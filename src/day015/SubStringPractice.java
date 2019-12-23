package day015;

public class SubStringPractice {
    public static void main(String[] args) {
        // getting the part of the String out of another string
                    // 0123456789012345
        String movie ="lord Of the Ring";

        // i want to get the string(word) <of> from this movie
        String wordOf = movie.substring(5,7);
        System.out.println(" wordOf = " + wordOf );
        String wordThe= movie.substring(8,11);
        System.out.println("wordThe= " + wordThe);

                      // 0123456789012345
        //String movie ="lord Of the Ring";
        // reverse lord of the Ring -----> Ring the of lord
        String wordRing=movie.substring(12);
        String wordOfThe=movie.substring(4,12);
        String wordLord=movie.substring(0,4);
        System.out.println(wordLord + wordOfThe + wordRing);
        //reverse
        System.out.println(wordRing + wordOfThe + wordLord);
    }
}
