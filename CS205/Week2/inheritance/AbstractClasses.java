package Week2.inheritance;

public class AbstractClasses {
    /**
     * The word "shape" is an abstraction. It is a term that is used to categorize
     * rectangles, ovals, triangles, and so on as being shapes. Why? Because those
     * objects all have certain attributes and behaviors in common and that is the
     * definition of what makes a square a shape and a dog not a shape.
     *
     * In OO design and programming, there is a way of specifying that a class
     * represents an abstraction and that it make no sense to instantiate objects
     * of that class. Such classes in Java are called abstract classes and the
     * defining characteristics are:
     *
     * 1. The class must be declared as an abstract class using the abstract reserved
     * word.
     *
     * 2. Abstract classes may not be instantiated (a nonabstract class—one in
     * which objects can be instantiated—is referred to as a concrete class).
     *
     * 3. An abstract class is essentially a container for instance variables and
     * instance methods that will be inherited by all subclasses of the abstract class.
     * These instance variables represent data that all objects in the class hierarchy
     * (the abstract class and all of its subclasses) have in common.
     *
     * 4. An abstract class may declare instance methods that are not implemented
     * (there is no body). Such methods are known as abstract methods and the
     * requirement is that subclasses must implement the abstract methods
     * (if a subclass does not implement all of the inherited abstract methods,
     * that subclass also becomes an abstract class).
     * */

    /*
    * All it takes to make Shape an abstract class is:
    * public abstract class Shape {
    *   ...
    * }
    *
    * Once Shape is declared abstract, it is no longer legal to instantiate a
    * Shape object:
    * public class ShapeCreate {
    *   public static void main(String[] args) {
    *       Shape newShape = new Shape(10, 20);
    *   }
    * }
    *
    * When I build this code I get a syntax error:
    * ShapeCreate.java:3: error: Shape is abstract; cannot be instantiated
    * Shape newShape = new Shape(10, 20);
    * ^ 1 error
    *
    * */

    /*
    * Currently our abstract Shape class does not contain any abstract methods.
    * As an example of an abstract method, suppose wish to add to the various
    * shape-related classes a draw() method which will be called on an object to
    * draw the shape on the graphical window.
    *
    * public Main() {
    *   public static void main(String[] args) {
    *       Rectangle rect = new Rectangle(10, 20, 40, 50);
    *       Oval oval = new Oval(5, 73, 18, 92);
    *       Square sq = new Square(230, 470, 55);
    *       rect.draw();
    *       oval.draw();
    *       sq.draw();
    *   }
    * }
    *
    * Can draw() be implemented in the abstract Shape class, i.e., is this okay?
    *
    * public abstract class Shape {
    *   ...
    *   void draw() {
    *       // Code is here that draws the Shape on the graphical window.
    *   }
    * }
    *
    * How would we implement draw()? If you think about it, drawing a Shape is
    * impossible because a Shape can have many different forms. Drawing a
    * Rectangle is not the same as drawing an Oval. They look different on the
    * window and the Java Class Library methods we call to draw a rectangle and
    * an oval are different. It makes sense that draw() cannot be implemented in
    * Shape and must be implemented in every subclass of Shape, i.e., Rectangle
    * will have a draw() method that gets called to draw rectangles on the window,
    * Oval will have a draw() method that gets called to draw ovals on the window.
    * Line will have a draw() method that gets called to draw lines on the window.
    * */

    /**
     * To specify that draw() is not implemented in Shape and that draw() must be
     * implemented in every subclass of Shape we make draw() an abstract method in
     * Shape. This is done by declaring the method but not providing a method body.
     *
     * public abstract class Shape {
     *  ...
     *  public void draw();  // No method body means draw() is an abstract method.
     * }
     *
     * Abstract methods must be implemented in subclasses and if not, the subclass
     * itself becomes an abstract class. This rule is how the compiler forces the
     * subclasses to implement draw().
     * */
}
