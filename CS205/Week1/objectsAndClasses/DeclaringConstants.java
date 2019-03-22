package Week1.objectsAndClasses;

/*
* The reserved word final specifies that the associated identifier cannot be changed,
* i.e. it is constant. Constants are generally declared as static and since constants
* cannot be changes, there is no harm in declaring them as public
* */

public class DeclaringConstants {
    public static final double PI = 3.14159265;
    public void someMethod(){
        double z = PI;
    }

    /*
    * // A public class may be accessed outside of the class
    * // by writing classname.classvariable
    * public Class C {
    *   public C(){
    *       double z = DeclaringConstants.PI;
    *   }
    * }*/
}
