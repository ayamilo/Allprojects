package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {
        //pre-increment   ++score
        //post-increment  score++
        //pre-decrement   --score
        //post-decrement  score--

        // example increment
        int apple = 8;
        apple++ ;
        System.out.println(apple);  //9
        System.out.println(apple++);// 9 but ready to be 10 next time apple appears
        System.out.println(apple);// 10


        // example
        int score = 50;
        System.out.println(++score); // 51
        System.out.println(score++); //51 and ready to show 52 when score show up next time
        System.out.println(score);// 52
        System.out.println(--score);//51
        System.out.println(score--);//51 will be 50 next time
        System.out.println(score);//50

    }
}
