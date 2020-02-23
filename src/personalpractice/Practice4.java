package personalpractice;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {

        
        
        String input = "AAABBBCCC";
        
        String nonDuplicates="";

        for (int i = 0; i <input.length() ; i++) {
            
            if(!nonDuplicates.contains(""+input.charAt(i))){
                nonDuplicates += ""+input.charAt(i);


                
            }

        }
        System.out.println("nonDuplicates = " + nonDuplicates);
String expectedResult="";
for(int j =0;j<nonDuplicates.length();j++){
        int times= 0;
        for (int i = 0; i <input.length() ; i++) {
            if(input.substring(i,i+1).equals(nonDuplicates.substring(j,j+1))){
                times++;
            }

        }
        expectedResult+=nonDuplicates.substring(j,j+1)+times;


    }
        System.out.println(expectedResult);



}

}














