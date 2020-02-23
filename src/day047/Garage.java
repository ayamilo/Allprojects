package day047;

public class Garage  {
    public static void main(String[] args) {
        // Abstract class can not be instantiated
        // It means we can not create object out of it
//        Car c1 = new Car();
ElectricCar c1 = new ElectricCar();
c1.start();
c1.goBackward();
c1.goForward();
c1.turn("Right");

         // Create another sub class of Car called GasCar
        //add a field called gasLevel
        // implement all the abstract method of Car class

        // Create GasCar object here
        // call all the method to test
        System.out.println();

GasCar c2 = new GasCar();
c2.start();
c2.goBackward();
c2.goForward();
c2.turn("left");
    }

}
