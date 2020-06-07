# Using a Child Class as its Parent Class

1. Start with this code

**Dinner.java**

```
class Dinner {
  
  private void makeNoodles(Noodle noodle, String sauce) {
    
    noodle.cook();
    
    System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
    System.out.println("Dinner is served!");
    
  }
  
  public static void main(String[] args) {
    
    Dinner noodlesDinner = new Dinner();
    // Add your code here:
    
    
  }
  
}
```

**Noodle.java**

```
class Noodle {
  
  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public void cook() {
    
    this.texture = "cooked";
    
  }
  
}
```

**BiangBiang.java**

```
class BiangBiang extends Noodle {
  
  BiangBiang() {
    
    super(50.0, 5.0, "flat", "high-gluten flour, salt, water");
    
  }
  
}
```

2. If you take a look at the ```Dinner``` class, you’ll see there’s a ```makeNoodles()``` method that accepts a ```Noodle``` object as an argument.

	In ```main()```, instantiate a ```BiangBiang``` object as a ```Noodle``` called ```biangBiang```.

	Then call ```makeNoodles()``` on ```noodlesDinner``` with the following arguments:

	- ```biangBiang```
	- ```"soy sauce and chili oil"```


Example solution can be found in the [BiangBiang.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Using%20a%20Child%20Class%20as%20its%20Parent%20Class/BiangBiang.java), [Dinner.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Using%20a%20Child%20Class%20as%20its%20Parent%20Class/Dinner.java), and [Noodle.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Using%20a%20Child%20Class%20as%20its%20Parent%20Class/Noodle.java) files