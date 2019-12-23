package day09;

public class languagePicker {
    public static void main(String[] args) {
        /*Language Picker :
// assume you are on the call and you have been given option to be greeted by the language of your choice according to the number you provided
Create a variable called languageOption , String variable called greeting

        1   —>> "Hello"
        2  —>> "Salam"
        3  —>> "Hola"
        4  —>> "Privet"
        5  —>> "Merhaba"
        6  —>> "Szia"
        7 —>  " bonjour"

The program should set the value of a String variable called greeting
 To this value.  :  1  —> "Hello , SDET "

Print out —>> This is how the greeting message you get : "Hello , SDET "
(edited)*/
        String greeting= "";
        int languageCode= 1;
        if (languageCode == 1) {
            greeting = "Salam";
        } else if
        (languageCode == 2) {
            greeting = "Hola";
        } else if (languageCode == 3) {
            greeting = "Privet";
        } else if (languageCode == 4) {
            greeting = "Merhaba";
        } else if (languageCode == 5) {
            greeting = "Szia";
        } else if (languageCode == 6) {
            greeting = "Bonjur";
        } else if (languageCode == 7) {
            greeting = "Guten Tag";
        }
        else {
            System.out.println("wrong");
        }
        System.out.println(greeting);
    }
    //System.out.println("Wrong number");



    }

