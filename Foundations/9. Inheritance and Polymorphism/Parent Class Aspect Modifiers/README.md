# Parent Class Aspect Modifiers

1. Start with this code

**Noodle.java**

```
public class Noodle {
  
  private double lengthInCentimeters;
  private double widthInCentimeters;
  private String shape;
  private String ingredients;
  private String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public boolean isTasty() {
    
    return true;
    
  }
  
  public static void main(String[] args) {
    
    Ramen yasaiRamen = new Ramen();
    //System.out.println(yasaiRamen.ingredients);
    System.out.println(yasaiRamen.isTasty());
    
  }
  
}
```

**Ramen.java**

```
public class Ramen extends Noodle {
  
  Ramen() {
    
    super(30.0, 0.3, "flat", "wheat flour");
    
  }
  
  public boolean isTasty() {
    
    return false;
    
  }
  
}
```

2. Currently, ```Noodle``` has an ```ingredients``` attribute that its child class ```Ramen``` cannot access because it has a ```private``` access modifier.

	Change the access modifier for ```ingredients``` so that ```Ramen``` (not just any Java file in any package) can access it.

3. ```Noodles``` has an ```isTasty()``` method that returns ```true``` because noodles are tasty. But if you check in the ```Ramen``` class, you’ll see someone overrode ```isTasty()``` to return ```false```! That person clearly doesn’t know food; all noodles are definitely tasty.

	Remove the method from ```Ramen``` and add a ```final``` keyword to ```isTasty()``` in ```Noodle``` so that nobody changes this method in any other ```Noodle``` child class again.

Example solution can be found in the [Noodle.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance/Parent%20Class%20Aspect%20Modifiers/Noodle.java) and [Ramen.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance/Parent%20Class%20Aspect%20Modifiers/Ramen.java) files