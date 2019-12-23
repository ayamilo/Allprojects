package day09;

public class DayPrinter {
    public static void main(String[] args) {
        /*
        create a variable called dayCode as a unit
        *if the dayCode is 1------> monday
        *if the dayCode is  2------>tuesday
        *if the dayCode is 3------>wednesday
        *if the dayCod   is 4------>thursday
        *if the dayCode is  5------->friday
         *if the dayCode is 6------->saturday
         *if the dayCode is 7-------->sunday

         */
        int dayCode = 5;
        if (dayCode == 1) {
            System.out.println("day is monday");
        } else if (dayCode == 2) {
            System.out.println("day is tuesday");
        } else if (dayCode == 3) {
            System.out.println("day is wednesday");

        } else if (dayCode == 4) {
            System.out.println("day is thursday");
        } else if (dayCode == 5) {
            System.out.println("day is friday");
        } else if (dayCode == 6) {
            System.out.println("day is saturday");
        } else if (dayCode == 7) {
            System.out.println("day is sunday");
        } else {
            System.out.println("day is unknown");
        }
    }
}
