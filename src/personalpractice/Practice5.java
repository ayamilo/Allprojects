package personalpractice;


public class Practice5 {
    public static void main(String[] args) {
//        System.out.println(palindrome("hanah"));
//
//    }
//    public static boolean palindrome(String name){
//String temp =name;
//String nameContainer=" ";
//        for (int i = name.length()-1; i >=0 ; i--) {
//            nameContainer +=name.charAt(i);
//
//        }
//        if(temp.equalsIgnoreCase(nameContainer)){
//            return true;
//
//        }
//            return false;

//        int a[]=new int[]{100,2,500,70};
//
//        System.out.println(a.length);
//        System.out.println(a[3]);
////for(int i = a.length; i<0; i--){
// //   System.out.print(a[i]+" ");
//        for(int each:a){
//            System.out.println(each);
//        }

//        int[][] a=new int[][] { {20,40},{9,23},{40,84} };
//
//        for (int i = 0; i <a.length ;  i++){
//            for (int j = 0; j <a.length-1 ; j++) {
//                System.out.println(a[i][j]);
//            }

//            }
//

//       String name="kamil";
//
//      // String reversedName="";
//
//        for (int i = name.length()-1;i>=0; i--) {
//
//            System.out.print(name.charAt(i));
//            System.out.println("="+i);

    ///    }

String name="leval";
String reversedName="";

        for (int i = name.length()-1; i >=0 ; i--) {
            //System.out.print(name.charAt(i));
            reversedName = reversedName + name.charAt(i);
        }
            System.out.println("reversed name = " + reversedName);
        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("name is a palindrome ");
        }else{
            System.out.println("name is not palindrome ");
        }

        for (int i = 50; i >=1 ; i--) {

            if(i%2==0){
                System.out.print(i + " ");

            }

        }

            }

        }







