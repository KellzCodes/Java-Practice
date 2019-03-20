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

    /*
    * Inheritance :: Calling an Overridden Superclass Method
    * Sometimes the behavior of a superclass-inherited method is exactly what the
    * subclass requires, but the subclass also has to perform some additional operations.
    *
    * Example: suppose at a university all students—undergraduate and graduate—are
    * assessed tuition using the same formula: tuition = $675 × credit hours. However,
    * graduate students in certain professional programs (e.g., dentistry, pharmacy,
    * medicine) are assessed an addition professional program fee of $3,500.
    *
    * We can write the calcTuition() method in Student that calculates a student's
    * tuition by multiplying $675 by the number of credit hours. We need to call
    * that method in the GraduateStudent class to calculate the tuition and then
    * add the professional program fee when necessary.
    *
    * public class Student {
    *   public double calcTuition() {
    *       return 675 * creditHours();
    *   }
    * }
    *
    * public class GraduateStudent extends Student {
    *   // calcTuition() is overridden and needs to call the superclass (Student)
    *   // calcTuition() method. Since these two methods have the same name, how do
    *   // we specify to the compiler that we are calling calcTuition() in Student?
    *   // By using the super reserved word.
    *   public double calcTuition() {
    *       double tuition = super.calcTuition();  // Calls Student.calcTuition();
    *       if (mProfessionalProgram == true) {
    *           tuition += 3500;
    *       } return tuition;
    *   }
    * }
    * */
}
