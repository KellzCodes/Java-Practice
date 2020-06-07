# Method Overriding

**Noodle.java**

1. Start with this code

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
    
    System.out.println("Boiling.");
    
    this.texture = "cooked";
    
  }
  
  public static void main(String[] args) {
    
    Spaetzle kaesespaetzle = new Spaetzle();
    kaesespaetzle.cook();
    
  }
  
}
```


**Spaetzle.java**


```
class Spaetzle extends Noodle {
  
  Spaetzle() {
    
    super(3.0, 1.5, "irregular", "eggs, flour, salt");
    this.texture = "lumpy and liquid";
    
  }
  
  // Add the new cook() method below:
  
  
}
```

2. Noodle has a ```cook()``` method that involves boiling the noodle and changing the texture to ```"cooked"```.

	The German noodle [spätzle](https://en.wikipedia.org/wiki/Sp%C3%A4tzle) involves a slightly unconventional cooking procedure: grinding or scraping the dough into the pot of boiling water.

	In **Spaetzle.java**, override the inherited ```cook()``` method. Copy the original method body, but before ```"Boiling"``` gets printed, add a new line to print ```"Grinding or scraping dough."```.

	Don’t forget to add ```@Override``` above the method to help with debugging.

Example solution can be found in the [Noodle.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Method%20Overriding/Noodle.java) and [Spaetzle.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Method%20Overriding/Spaetzle.java) files