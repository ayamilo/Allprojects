package day022;

public class Task1Array {
    public static void main(String[] args) {
       // create an byte array with size 4
// and store it into a variable called data
// assign value for each index location
// print out the values at each index
// update last index value
// then print it out
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = 30;
        data[2] = 50;
        data[3] = 40;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        //update data[4]=70
        data[3]=70;
        System.out.println(data[3]);
    }

}
