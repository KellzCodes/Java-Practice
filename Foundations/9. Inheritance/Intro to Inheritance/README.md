1. Start with this code

**Noodle.java**

```
class Noodle {
  
  double lengthInCentimeters;
  String shape;
  String texture = "brittle";
  
  public void cook() {
    
    this.texture = "cooked";
    
  }
  
  public static void main(String[] args) {
    
  }
  
}
```

**Spaghetti.java**

```
class Spaghetti {

}
```

2. You have two files:

	- **Noodle.java**: This will house your parent class.
	- **Spaghetti.java**: This is where you will build your child class.

	The ```Noodle``` class has already been defined for you, including:

	- The ```lengthInCentimeters``` field.
	- The ```shape``` field.
	- The ```texture``` field.
	- A ```cook()``` method.

	In **Spaghetti.java**, create a class called ```Spaghetti```.

	Then tab back over to **Noodle.java** to run your code. (We always need to run our program using the file that contains the ```main()``` method.)

3. Tab back over to **Spaghetti.java** and make ```Spaghetti``` a child class of ```Noodle``` (if you haven’t already).

4. Tab back over to **Noodle.java**.

	In ```main()```, instantiate a new ```Spaghetti``` object called ```spaghettiPomodoro```.

	Print out its ```texture``` field to the terminal.

Example solution can be found in the [Noodle.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance/Intro%20to%20Inheritance/Noodle.java) and [Spaghetti.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance/Intro%20to%20Inheritance/Spaghetti.java) files