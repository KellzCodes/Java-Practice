# The Prime Directive Project

1. Start with this code

```
// Import statement:

class PrimeDirective {
  
  // Add your methods here:
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

  }  

}
```

2. Take a look at **PrimeDirective.java**:

	There’s a class ```PrimeDirective``` where you’ll be creating your program.

	Inside ```main()```, an instance of ```PrimeDirective``` (```pd```) has been instantiated. Below that, you’ll see an ```int``` array called ```numbers``` that has a series of integers.

	**To Do**: Import ```ArrayList``` from ```java.util``` at the very top of your program, above the ```PrimeDirective``` class. This will allow you to use ```ArrayList```s.

3. First, we need a way to determine whether a number is prime or isn’t prime.

	Create an empty ```public``` method ```isPrime()``` that:

	- has one parameter: an ```int``` called ```number```
	- will return ```true``` if ```number``` is prime
	- will return ```false``` if ```number``` is not prime

4. Take a moment to consider what makes a prime number prime:

	- greater than 1
	- only divisible by 1 and itself

	In fact, every number is divisible by 1, so we don’t really care about being able to divide by 1.

	Imagine we have a number ```n```. If ```n``` is prime, then ```n``` should not be divisible by any integers between ```2``` and ```n-1```.

	But how can we check this?

	Before you move on, take out paper and a pencil and write down your ideas about how to check if a number is prime.

5. Inside ```isPrime()```, create a ```for``` loop:

	- set a counter ```i``` equal to ```2```
	- run the loop while ```i``` is less than ```number```
	- increment ```i```

6. As you loop through each ```i``` value, you want to check if ```number``` is divisible by it.

	Inside the loop:

	- Check if ```number``` is divisible by ```i```.
	- If it is, then ```number``` is not prime, so you can return ```false``` from the method.

7. Below the ```for``` loop, return ```true``` because ```number``` isn’t divisible by any two smaller integers.

8. Wait a second… what about 2 or numbers less than 2? Well, those are our edge cases.

	In ```isPrime()``` above the ```for``` loop, build an ```if```/```else if``` statement to handle the following edge cases:

	- If ```number``` is 2, it is the smallest prime number.
	- If ```number``` is less than 2, it is not prime.

9. Test out your ```isPrime()``` method on ```pd``` in ```main()``` and see if it works!

	Try it out with a few numbers:

	- ```7``` should return ```true```
	- ```28``` should return ```false```
	- ```2``` should return ```true```
	- ```0``` should return ```false```

	Don’t forget to run your code with the following: ```java PrimeDirective```

10. Nice work! Now, all that’s left is building an ```ArrayList``` of the prime numbers in the ```numbers``` array.

	You can create another method to handle this. Build an empty method called ```onlyPrimes()``` that:

	- returns an ```ArrayList``` of integers
	- has a parameter ```numbers```, which is an array of ```int```s

11. Inside the ```onlyPrimes()``` body, create a new empty ```ArrayList``` called ```primes``` to store all the prime numbers that are found.

12. So how do you find all of the primes in an array? Why using a for-each loop!

	Set up a for-each loop that checks each ```number``` in ```numbers```.

13. Now, if ```number``` is prime, you can add it to ```primes```.

14. At the end of the method below the for-each loop, return ```primes```  from ```onlyPrimes()```.

15. Time to put it all together!

	In ```main()```, test out ```pd.onlyPrimes()``` on the ```numbers``` array.

	Don’t forget to run your code with: ```java PrimeDirective```

Example solution can be found in the [PrimeDirective.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/7.%20Loops/The%20Prime%20Directive%20Project/PrimeDirective.java) file