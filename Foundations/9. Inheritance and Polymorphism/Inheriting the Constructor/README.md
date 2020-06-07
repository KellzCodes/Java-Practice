# Inheriting the Constructor

1. Start with this code

**Noodle.java**

```
class Noodle {
  
  double lengthInCentimeters;
  double widthInCentimeters;
  String shape;
  String ingredients;
  String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public void cook() {
    
    this.texture = "cooked";
    
  }
  
  public static void main(String[] args) {
    
    
    
  }
  
}
```

**Pho.java**

```
class Pho extends Noodle {
  
  
  
}
```

2. Tab over to **Pho.java** and build a constructor for ```Pho```.

	Leave the constructor’s parameters blank. Inside the constructor, pass the following arguments in the following order to ```super()``` — the constructor for ```Noodle```:

	- A ```lengthInCentimeters``` of ```30.0```
	- A ```widthInCentimeters``` of ```0.64```
	- A ```shape``` of ```"flat"```
	- ```ingredients``` of ```"rice flour"```

3. Tab back over to **Noodle.java**. Inside ```main()```, instantiate a new ```Pho``` instance called ```phoChay```.

	Now print out ```phoChay```‘s ```shape```.


Example solution can be found in the [Noodle.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance/Inheriting%20the%20Constructor/Noodle.java) and [Pho.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance/Inheriting%20the%20Constructor/Pho.java) files