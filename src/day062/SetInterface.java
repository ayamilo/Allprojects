package day062;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        // Creating a HashSet with items already inside

        List<Integer> numList = Arrays.asList(10, 10, 20, 20, 20, 30, 30, 30, 30);
        System.out.println("numList = " + numList);

        Set<Integer> myNumSet = new HashSet<>(numList);
        System.out.println("myNumSet = " + myNumSet);

    }
}
