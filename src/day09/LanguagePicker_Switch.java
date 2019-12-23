package day09;

public class LanguagePicker_Switch {
    public static void main(String[] args) {
        /*
        1   —>> "Hello"
        2  —>> "Salam"
        3  —>> "Hola"
        4  —>> "Privet"
        5  —>> "Merhaba"
        6  —>> "dagbani"
        7 —>  " twi"

         */
        int languageCode = 1;
        switch (languageCode) {
            case 1:
                System.out.println("language is hello");
                break;//used to get out of this branch
            case 2:
                System.out.println("language is salam");
                break;
            case 3:
                System.out.println("languge is holla");
                break;
            case 4:
                System.out.println("laguage is privet");
                break;
            case 5:
                System.out.println("language is merhaba");
                break;
            case 6:
                System.out.println("language is dagbani");
                break;
            case 7:
                System.out.println("language is twi");
                break;
            default:
                System.out.println("day is unknown");

        }


    }
}