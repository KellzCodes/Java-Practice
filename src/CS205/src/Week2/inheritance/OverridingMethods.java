package Week2.inheritance;

public class OverridingMethods {
    /*
    * A subclass inherits the public and protected methods of its superclass.
    * In many cases, the behavior of those methods is exactly what the subclass needs:
    *
    * public class Super {
    *   private int mX;
    *   ...
    *   public int getX() { return mX; }
    *   public void setX(int pNewX) { mX = pNewX; }
    * }
    *
    * public class Sub extends Super {
    * // getX() and setX() are inherited and do exactly what Sub needs, i.e., given
    * // a Sub object, we can call getX() and setX() on that object to read and write
    * // the mX instance variables of the Sub object.
    * //
    * // Sub sub = new Sub();
    * // sub.setX(100);        // Sets mX of sub to 100.
    * // ...
    * // int x = sub.getX();   // Sets x to mX of sub.
    * }
    * */

    // An inherited method which is "re-implemented" in a subclass is said to be
    // overridden in the subclass. Subclasses override methods when the behavior
    // of the method in the subclass differs from the behavior of the method in
    // the superclass. If the behavior of the method in superclass already does
    // exactly what the subclass needs, then the subclass would not override the
    // method
}
