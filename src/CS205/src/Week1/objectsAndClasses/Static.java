package Week1.objectsAndClasses;

/*
* A variable declared using the static reserved word tells the Java compiler
* that the variable is a class variable rather than an instance variable.
* Class variables do not appear in objects of the class, but rather, class
* variables belong to the class
* */

public class Static {
    public static void main(String[] args){
        Static obj1 = new Static();
        Static obj2 = new Static();
        Static obj3 = new Static();
        obj1.someMethod(); obj1.someMethod(); obj1.someMethod();
        obj2.someMethod(); obj2.someMethod();
        obj3.someMethod();
        System.out.println(obj1.getCounter());
    }

    // Class variable (NOT an instance variable)
    private static int mCounter = 0;
    public Static(){}
    public int getCounter(){
        return mCounter;
    }
    public void someMethod(){
        ++mCounter;
    }
}
