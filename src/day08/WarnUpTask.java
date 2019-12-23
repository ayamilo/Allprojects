package day08;



public class WarnUpTask {
    public static void main(String[] args) {
        /*
        voting eligibility program
        create a variable called age as int
        check whether this age is more than 18
        if yes print: your ready to vote!!
        if it's less 18 wait until you are 18
         */
        int age = 27;

        System.out.println(age>=18);
        if(age>=18) {
            System.out.println("you are ready to vote");

        }else{
            System.out.println("wait until you are 18");
        }

    }

}
