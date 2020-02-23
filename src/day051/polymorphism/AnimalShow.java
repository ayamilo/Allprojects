package day051.polymorphism;

public class AnimalShow {
    public static void main(String[] args) {
        //Dog a1 = new Dog();
        // we are referring Dog object using Animal reference
        Animal a1 =new Dog();
        a1.makeNoise();

        // here we are just reassigning a1 to a different object
        a1 =new Horse();
        a1.makeNoise();


    }
}
