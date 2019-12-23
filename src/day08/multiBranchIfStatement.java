package day08;

public class multiBranchIfStatement {
    public static void main(String[] args) {
        //pseudo code
        /*
        given your currentSpeed and speedlimit
        check whether the currentSpeed is:
        -more than 90----> jail
        -more than 80 and less than 90----> reckless driving
        -more than 70 and less than 80 ----> point taken
        _more than 60 and less than 70 -----> warning
         if not speeding keep driving
         */
        int currentSpeed= 55;
        if(currentSpeed>70) {
            System.out.println("you are speeding more than 70 ---POINTS TAKEN!!!!");

        }else if (currentSpeed>60){
            System.out.println("your speed is less than or equal 70 but more than 60----warning");

        } else{
            System.out.println("keep driving you are good");
        }
    }
}
