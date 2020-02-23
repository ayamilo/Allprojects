package day059;

public class General {
    public static void main(String[] args) {

        // object o = new String ("ABC");
        // can I get the first char using o
       // System.out.println(o.charAt(0));

        System.out.println("THE START ");
String str=null;
try{
    System.out.println(str.charAt(0));
    System.out.println("END OF TRY ");

}catch(NullPointerException bla){
    System.out.println(" NO OBJECT HERE !!!");

}catch(Exception e){
    System.out.println("THIS IS THE REST OF EXCEPTIONS ");
}

        System.out.println("THE END");

    }
}