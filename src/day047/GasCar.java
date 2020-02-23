package day047;

public class GasCar extends Car{
    // Create another sub class of Car called GasCar
    //add a field called gasLevel
    // implement all the abstract method of Car class

    // Create GasCar object here
    // call all the method to test



    @Override
    public void start() {
        System.out.println("THID IS HOW GAS CAR STARTS");

    }

    @Override
    public void goForward() {
        System.out.println("GAS CAR GO FORWARD");
    }

    @Override
    public void goBackward() {
        System.out.println("GAS CAR GO BACKWARD");
    }

    @Override
    public void turn(String direction) {
        System.out.println("GAS CAR TURNING " + direction);
    }
}
