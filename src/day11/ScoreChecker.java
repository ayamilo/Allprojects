package day11;

public class ScoreChecker {
    public static void main(String[] args) {
        /*
         * create a variable called score and assign a value  of your choice
         * if the score is less than 0 or more than 100 -----> invalid Score!!!!
         * if the score is 100 -----> perfect score
         * if the score is between 70-100 -----> you have passed
         * else you have failed
         * */
        int score =-1;


        if (score < 0 || score > 100) {
            System.out.println(" invalid score ");


        } else if (score == 100) {
            System.out.println("perfect score ");


        } else if (score > 70 && score < 100) {
            System.out.println("you have passed");


        } else {
            System.out.println(" you have failed");}


        }
    }