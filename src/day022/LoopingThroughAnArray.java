package day022;

public class LoopingThroughAnArray {
    public static void main(String[] args) {
        //creating array object with empty slot
        int[] scores = new int[4];
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;
        //accessing the elements inside array one by one
        //System.out.println(scores[0]);
        //System.out.println(scores[1]);
        //System.out.println(scores[2]);
        //System.out.println(scores[3]);


        // how do we get the size of any array
        //  array object has a property called length
        int itemCount = scores.length;
        for (int x = 0; x < itemCount; x++) {
            System.out.println(scores[x]);


        }

        // print this array in reverse order



            // how do we get the char count of a String
          //  String name = "Jon Snow";
           // int charCount = name.length();
        }
    }
