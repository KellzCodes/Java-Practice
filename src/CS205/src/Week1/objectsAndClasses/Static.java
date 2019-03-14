package Week1.objectsAndClasses;

/*
* A variable declared using the static reserved word tells the Java compiler
* that the variable is a class variable rather than an instance variable.
* Class variables do not appear in objects of the class, but rather, class
* variables belong to the class
* */

public class Static {
    /*
    * Methods can also be declared as static and in this case,
    * rather than being called an instance method, the method
    * is called a class method. Class methods belong to the class
    * as well and are not part of objects of the class.
    *
    * Every Java application must have a main() method which is a class
    * method:
    * public class Main() { public static void main(String[] args) { ... } }
    *
    * The java.lang.Math class has several static methods for performing
    * mathematical operations:
    * static double Math.abs(double a) absolute value of a static double
    * Math.log(double a) log base e of a static double
    * Math.log10(double a) log base 10 of a static double
    * Math.max(double a, double b) maximum of a and b static double
    * Math.min(double a, double b) minimum of a and b static double
    * Math.pow(double a, double b) returns a to the bth power static int
    * Math.round(double a) returns a rounded up or down static double
    * Math.sqrt(double a) returns square root of a
    *
    * */
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
