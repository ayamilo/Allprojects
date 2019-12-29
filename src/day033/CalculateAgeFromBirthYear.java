package day033;

public class CalculateAgeFromBirthYear {
    public static void main(String[] args) {
        System.out.println(calculateAgeFromBirthYear(1983));
    }

    /**
     * calculateAndReturnAge
     * This method will
     * calculate the the age according to the birth year
     * and return the age
     *
     * @param birthYear the number that represent birth year
     * @return the calculated value from the age
     * if the birth year is not within 1900-2020 return 0
     */
    public static int calculateAgeFromBirthYear(int birthYear) {
        // I want to take out negative scenario first and just return 0
        if (birthYear <= 1900 || birthYear >= 2020) {
            return 0;
        }
        // If I reach this point , it means the birth year is valid
        return 2019 - birthYear;

    }


}


