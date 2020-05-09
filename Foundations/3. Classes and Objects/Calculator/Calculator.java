// Calculator program that does simple math operations
public class Calculator {
  // constructor
  public Calculator(){
    
  }

  // method that adds two ints
  public int add(int a, int b){
    return a + b;
  }
  
  // method that subtracts two ints
  public int subtract(int a, int b){
    return a - b;
  }
  
  // method that multiplies two ints
  public int multiply(int a, int b){
    return a * b;
  }
  
  // method that divides two ints
  public int divide(int a, int b){
    return a / b;
  }
  
  // method that returns the remainder of two ints
  public int modulo(int a, int b){
    return a % b;
  }

  // main method
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(5,6));
    System.out.println(myCalculator.divide(25,5));
    System.out.println(myCalculator.modulo(46,7));
  }
}