package Week1.objectsAndClasses;

/*
* To declare object variables of a class we write:
* Class object;
* Point pete;
*
* Once declared to instantiate (create) an object of a class we use a new
* operator:
*   object = new Class([optional-args]);
*   pete = new Point(10, 20);
*
* These two operations can be combined in one statement"
*   Class object = new Class([optional-args]);
*   Point patty = new Point(30, 40); // calls Point (int, int)
**/

public class InstantiatingObjects {
    public static void main (String[] args){
        Point pete = new Point(10, 20);
        pete.setX(50);
        someMethod();
    }

    /*
    * A private instance method may only be called by other methods
    * of the same class
    * */
    private static void someMethod(){
        System.out.println("some method");
    }
}
