package day023;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        /*
         * create a long array or 5 items called salaries
         * put your salary amounts that ok for your offer
         *
         * use for each loop to iterate over them
         * and print them out
         *
         *
         * OPTIONALLY : use different for each loop to
         * print only the salary more than 100000
         *
         * OPTIONALLY :
         * use for each loop to find the max
         * use for each loop to find the sum
         *
         * */
        long[] salaries={100000L,105000L,75000L,150000L,125000L};
        for( long  eachSalary      : salaries){
            System.out.println("each Salary = " + eachSalary);
        }

    }
}
