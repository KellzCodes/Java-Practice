# Child Classes in Arrays and ArrayLists

1. Start with this code

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
  
  public String getCookPrep() {
    
    return "Boil noodle for 7 minutes and add sauce.";
    
  }
  
  
  public static void main(String[] args) {
    
    Noodle spaghetti, ramen, pho;
    
    spaghetti = new Spaghetti();
    ramen = new Ramen();
    pho = new Pho();
    
    // Add your code below:
    
    
  }
  
}
```

**Spaghetti.java**

```
class Spaghetti extends Noodle {
  
  Spaghetti() {
    
  	super(30.0, 0.2, "round", "semolina flour");
    
  }
  
  @Override
  public String getCookPrep() {
    
    return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";
    
  }
  
}
```

**Ramen.java**

```
class Ramen extends Noodle {
  
  Ramen() {
    
    super(30.0, 0.3, "flat", "wheat flour");
    
  }
  
  @Override
  public String getCookPrep() {
    
    return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
    
  }
  
}
```

**Pho.java**

```
class Pho extends Noodle {
  
  Pho() {
    
    super(30.0, 0.64, "flat", "rice flour");
    
  }
  
  @Override
  public String getCookPrep() {
    
    return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";
    
  }
  
}
```

2. Declare and initialize an array of type ```Noodle``` called ```allTheNoodles``` with the following items:

	- ```spaghetti```
	- ```ramen```
	- ```pho```

3. Loop through each noodle in ```allTheNoodles```.

	Call ```getCookPrep()``` on each noodle and print the result.


Example solution can be found in the [Noodle.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Child%20Classes%20in%20Arrays%20and%20ArrayLists/Noodle.java), [Pho.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Child%20Classes%20in%20Arrays%20and%20ArrayLists/Pho.java), [Ramen.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Child%20Classes%20in%20Arrays%20and%20ArrayLists/Ramen.java), and [Spaghetti.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Child%20Classes%20in%20Arrays%20and%20ArrayLists/Spaghetti.java) files