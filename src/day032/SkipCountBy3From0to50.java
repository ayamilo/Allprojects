package day032;

public class SkipCountBy3From0to50 {
    public static void main(String[] args) {

       /* skipCountBy3From0to50

          create a method that has no parameter
          and skip count by 3 from 0 to 50
       */
        SkipCountBy3From0to50();
    }

    public static void SkipCountBy3From0to50() {
        for (int i = 0; i < 50; i = i + 3) {
            System.out.print(i + " ");

        }


    }
}
