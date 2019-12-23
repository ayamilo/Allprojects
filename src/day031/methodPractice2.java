package day031;

public class methodPractice2 {
    public static void main(String[] args) {
        // write a piece of reusable code to count 1 to 10
        // give a name count1to10                               : method name
        // no need for object when being called                 : static
        //it should be accessible anywhere in your project      :public
        // it does not return any value                         : void
        // does not need any external data when being called   : (nothing inside)
count1to10();
        System.out.println();
count1to10();
        System.out.println();
methodPractice2.count1to10();

    }


    public static void count1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

    }
}
