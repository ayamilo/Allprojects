package day031;

public class MethodPractice3 {
    public static void main(String[] args) {
        // create a method called countDownFrom2
        countDownFrom20();
        System.out.println();
        countDownFrom20();
    }


    public static void countDownFrom20(){
    for (int i = 20; i >0 ; i--) {
        System.out.print(i +" ");
    }

}
}