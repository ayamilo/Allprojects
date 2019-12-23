package day022;

public class ArrayTask2 {
    public static void main(String[] args) {
        // create a char array that hold all the letters
        // from your first name and assign values using each
        // characters of your first name

        char[] myNameChar = new char[5];
        myNameChar[0] = 'k';
        myNameChar[1] = 'a';
        myNameChar[2] = 'm';
        myNameChar[3] = 'i';
        myNameChar[4] = 'l';

        System.out.println(myNameChar[0]);
        System.out.println(myNameChar[1]);
        System.out.println(myNameChar[2]);
        System.out.println(myNameChar[3]);
        System.out.println(myNameChar[4]);

        // THIS WILL ACTUALLY PRINT
        // THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
        //AND THIS IS ONLY FOR CHAR ARRAY, ANYTHING ELSE WILL
        // PRINT MEMORY ADDRESS
        System.out.println(myNameChar);


        // Array with boolean


        boolean[] yesNo = new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = 10 > 7;//true

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        // immutable means you cannot change
        // the internal structure  of the object
        // if you have String abc = "hello"
        // if you do abc.toUppercase--> it will create new
        // String object "HELLO"
        // and it does not change original hello at all

        // not resizable --> specifically for array
// we can not change the size of array once we create them with certain size
// However , we can change the elements inside this array
// and it means : IT IS NOT IMMUTABLE


    }
    }
