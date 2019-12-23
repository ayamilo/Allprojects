package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {
        char grade = 'B';
        System.out.println(grade);
        int letterToNumber = 'B';
        System.out.println(letterToNumber);
        // 'B' is represented by 66 in ASCII table
        // here type char is automatically widened to int
        // and stored as number. you don't need to know where the number is coming from.
        // it is pre-designed

        // find out your number of each character in your name
        // name : kamil

        char initial = 'k';
        System.out.println(initial);
        int initialInt_Toint= 'k';
        System.out.println(initialInt_Toint);
        char secondIn = 'a';
        System.out.println(secondIn);
        int secondIni_Toint= 'a';
        System.out.println(secondIni_Toint);
        char thirdAlph = 'm';
        System.out.println(thirdAlph);
        int thirdIni_Toint= 'm';
        System.out.println(thirdIni_Toint);
        char fourthAlph= 'i';
        System.out.println(fourthAlph);
        int fourthIni_Toint= 'i';
        System.out.println(fourthIni_Toint);
        char fiveAlph= 'l';
        System.out.println(fiveAlph);
        int fiveInt_Toint= 'l';
        System.out.println(fiveInt_Toint);


    }
}
