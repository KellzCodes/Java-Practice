## Methods: Scope

1. Open the [Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Methods-Scope/Store.java) file

2. Inside of the ```advertise()``` method, change the ```productType``` variable to the ```cookie``` variable, which is declared in the ```main()``` method. This should also result in the printout:
	> Selling cookies!
	
	Right?

3. No! We got an error! The ```cookie``` variable cannot be accessed inside of the advertise method. The scope is wrong! Change it back to ```productType```:

```
	String message = "Selling " + productType + "!";
```

4. Inside of the ```main()``` method, print the String ```message```, which is declared in the ```advertise()``` method. This should print:
	> Selling Cookies!

	Right?

5. Foiled again! The ```message``` variable only exists inside the scope of the ```advertise()``` method!

	Delete the faulty print statement from the ```main()``` method.
