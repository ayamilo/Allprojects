package day034;

public class MathActionFromJDK {
    public static void main(String[] args) {
        // where is String coming from?
        // its coming from package called java.lang
        // its a special package
        // and any class in it , does not need importing when being used
        // for example String class
        // what if i really want explicitly import String class
        // import java.lang.String
        String str="hello";


        // there is a class under java.lang called Math
        //and it has lots of math utlity methods that ready to be used
        int sum =Math.addExact(10,20);
        System.out.println("sum = " + sum);

        System.out.println("max of 10 and 20 = " +Math.max(10,20) );

    }
}
