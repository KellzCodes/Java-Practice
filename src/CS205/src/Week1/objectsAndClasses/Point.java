package Week1.objectsAndClasses;

/*
* An object encapsulates data members and method members. Objects are instances
* of classes and a class specifies the data and method members of objects. A
* class is like a blueprint for objects of the class and is used to construct
* the object and is used to construct the object in memory at runtime
* */

public class Point {
    /*
    * A point in the Cartesian plane is located at (x, y) where x and y
    * form the coordinates of the point
    * */
    // Data Members / Instance Variables
    private double x;
    private double y;

    /*
    * All classes must have at least one constructor even if that constructor
    * does nothing
    *
    * The default constructor of a class is the constructor that has no
    * parameters. If you do not write a constructor, the compiler automatically
    * generates a default constructor
    *
    * Constructors may be overloaded
    * */
    public Point(){ // Default constructor
        setX(0);
        setY(0);
    }

    public Point(double initX, double initY){ // Second constructor
        setX(initX);
        setY(initY);
    }

    // Mutator method for y
    public void setY(double y) {
        this.y = y;
    }

    // Mutator method for x
    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
