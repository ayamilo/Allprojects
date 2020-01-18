package day040;

public class Offer {
    String location;
    String company;
    long salary;
    boolean isFullTime;

    /**
     * This is a instance method to print all the information about Offer object
     * no parameter and no return type
     */
    // inside instance method we can directly access instance variable
    public void displayInformation() {

        System.out.println("Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime);
    }

    // Write a method called turnToFullTime
    public void turnToFullTime() {

        if (isFullTime == false) {
            isFullTime = true;
        }
    }

    //write a method to change location of the offer
    // to the location user passed
    public void changeLocation(String newLocation) {
        location = newLocation;
    }

    public void changeAllInfo(String newLocation, String newCompany, long newSalary, boolean newIsFullTime) {
        location = newLocation;
        company = newCompany;
        salary = newSalary;
        isFullTime = newIsFullTime;
    }
// write a method to check the offer belong to 100K club and return the result as true false

    /**
     * a method to check the offer belong to 100K club
     *
     * @return true if salary is more than 100k , false if not
     */
    public boolean is100KOffer() {
        // salary>=100000 already generate a boolean result
        // so we can directly return that result
        return salary >= 100000;

    }
    /**
     * Create an instance method called toString
     * has no parameter
     *
     * @param
     * @return String representation of Offer Object
     * <p>
     * In below format
     * [Location = Virginia , Company = Amazon | Salary = 150000 $ | isFullTime = true]
     */
    public String toString() {

        String str = "[ Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime + " ]";
        return str;
    }
}