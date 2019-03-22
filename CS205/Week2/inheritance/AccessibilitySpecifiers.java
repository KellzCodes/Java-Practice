package Week2.inheritance;

public class AccessibilitySpecifiers {
    /*
    * Inheritance :: Accessibility Specifiers and Instance Methods
    *
    * The meaning of the accessibility modifiers public, protected, and private
    * regarding superclass methods and subclass objects is the same as for
    * superclass attributes:
    *
    * 1. public methods may be called from subclass objects. In fact, public methods
    * of objects are callable from the methods of objects of any class.
    *
    * 2. protected methods may be called from subclass objects, but they are not
    * callable from within the methods of objects of other classes.
    *
    * 3. private methods are only callable in objects of the superclass; they are
    * not callable from within the methods of subclass objects.
    *
    * public class Super {
    *   // mPublic is public for illustration purposes. Do not ever declare a public
    *   // instance variable.
    *   public int mPublic;
    *   protected int mProtected;
    *   private int mPrivate;
    *   private int mPrivate2;
    *   ...
    *   protected int getPrivate() { return mPrivate; }
    *   protected void setPrivate(int pNewPrivate) { mPrivate = pNewPrivate; }
    *   public int getPrivate2() { return mPrivate2; }
    *   public void setPrivate2(int mNewPrivate2) { mPrivate2 = pNewPrivate2; }
    * }
    *
    * public class Sub extends Super {
    *   public Sub() { mPublic = 0;           // Legal because mPublic is public.
    *   mProtected = 0;        // Legal because mProtected is protected.
    *   setPrivate(0);         // Legal because setPrivate() is protected.
    *   int x = getPrivate();  // Legal because setPrivate() is protected.
    *   setPrivate2(0);        // Legal because setPrivate2() is public.
    *   int x = getPrivate2(); // Legal because setPrivate2() is public.
    *   }
    * }
    *
    * public class C {
    *   private Super super;  // This is a composition relationship.
    *   private Sub sub;      // This is also composition relationship.
    *   public C() {
    *       super = new Super();
    *       super.mPublic = 0;           // Legal: mPublic is public.
    *       super.mProtected = 0;        // Illegal: C is not a subclass of Super.
    *       super.mPrivate = 0;          // Illegal: mPrivate is private.
    *       super.setPrivate(0);         // Illegal: setPrivate() is protected.
    *       int y = super.getPrivate();  // Illegal: getPrivate() is protected.
    *       super.setPrivate2(0);        // Legal: setPrivate2() is public.
    *       int x = super.getPrivate2(); // Legal: getPrivate2() is public.
    *       sub = new Sub();
    *       sub.mPublic = 0;             // Legal: mPublic is public.
    *       sub.mProtected = 0;          // Illegal: mProtected is protected.
    *       sub.mPrivate = 0;            // Illegal: mPrivate is private.
    *       sub.setPrivate(0);           // Illegal: setPrivate() is protected.
    *       int y = sub.getPrivate();    // Illegal: getPrivate() is protected.
    *       sub.setPrivate2(0);          // Legal: setPrivate2() is public.
    *       int x = sub.getPrivate2();   // Legal: getPrivate2() is public.
    *  }
    *}
    *
    * Inheritance :: Accessibility Specifiers Recommendations
    *
    * 1. Declare all instance variables in every class as private.
    *
    * 2. If an instance variable must not be accessible in other classes—whether
    * subclasses or not—do not provide accessor and/or mutator methods (or
    * provide private accessor/mutator methods for use within the class).
    *
    * 3. If an instance variable must be accessible in other classes—whether
    * subclasses or not—declare public accessor and/or mutator methods to
    * provide read/write access.
    *
    * 4. If an instance variable must be accessible in subclasses, but not
    * in other nonsubclasses—declare protected accessor and/or mutator
    * methods to provide read/write access to objects of subclasses.
    *
    * 5. If a method is only intended to be called by other methods of the
    * same class declare the method as private.
    *
    * 6. If a method must be callable from the methods of subclass objects declare
    * the method as protected.
    *
    * 7. If a method must be callable from the methods of any object—whether
    * subclass objects or not— declare the method as public.
    *
    *
    * public class Super {
    *   // All instance variables are private.
    *   private T mX;
    *   private T mY;
    *   private T mZ;
    *
    *   // Public methods are callable from the methods of any object of any class.
    *   public void doItAgain() { ... }
    *   public T getZ() { return mZ; }
    *   public void setZ(T pNewZ) { mZ = pNewZ; }
    *
    *   // Protected methods are callable from Super and Sub methods.
    *   protected void doSomethingElse() { ... }
    *   protected T getY() { return mY; }
    *   protected void setY(T pNewY) { mY = pNewY; }
    *
    *   // Private methods are callable only from methods of Super.
    *   private void doSomething() { ... }
    *   private T getX() { return mX; }
    *   private void setX(T pNewX) { mX = pNewX; }
    * }
    * */
}
