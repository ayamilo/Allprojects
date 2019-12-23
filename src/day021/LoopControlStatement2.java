package day021;

public class LoopControlStatement2 {
    public static void main(String[] args) {
        //continue
        //if line contains reaches, the loop will skip to next iteration
        //we can use break and continue for any of the loop

        for (int x = 1; x <=10 ; x++) {
            if (x%2==1){
                continue;
            }
            System.out.println(x);

        }
    }
}
