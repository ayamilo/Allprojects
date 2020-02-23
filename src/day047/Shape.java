package day047;

public abstract class  Shape {
    String name;
    int area;
    // add a constructor to set this name value
    public Shape(String name) {
        this.name = name;
    }

    // add a abstract void method called calculateArea
    public abstract void calculateArea();

    // I want to enforce sub classes to provide toString method !!!!
    public abstract String toString();

}
    // add a constructor to set these two value


    // add a abstract method called calculateArea

    // add two concrete class of shape:
    // Triangle
    //        instance fields : int height and base
    //constructor
    //        to set name , height , base
    //        implements implement calculateArea method
    // add toString method
    //
    // Rectangle
    //        instance fields : width and height
    //        implements calculatedArea method area=height * width
    // add toString method



