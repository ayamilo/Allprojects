package day016;

public class SecondWordGetter {
    public static void main(String[] args) {
        // given a sentence with 3 words
        // get the second word
        // That is print the second word
        // find the index of first space
        // find the index of last space
        // solution:


                        //01234567890
        String sentence= "I Love Java";
        String secondWord;
        int firstSpaceIndex= sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);
        int lastSpaceIndex=sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);
        System.out.println(sentence.substring(1+1,+6));
        secondWord=sentence.substring(firstSpaceIndex+1,lastSpaceIndex);
        System.out.println("second word = "+ secondWord);
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);
    }
}
