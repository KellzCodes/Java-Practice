# String Methods

As you may recall, a ```String```, which is widely used in Java, is an object that represents a sequence of characters. It is a great way to store information.

Because character strings are so vital to programming, Java dedicated an entire class to them. This is great news for us because the ```String``` class provides a lot of useful methods to help us perform operations on strings and data manipulation.

In this lesson, we will go over several string methods:

- [```length()```](#length)
- [```concat()```](#concat)
- [```equals()```](#equals)
- [```indexOf()```](#indexOf)
- [```charAt()```](#charAt)
- [```substring()```](#substring)
- [```toUpperCase()``` / ```toLowerCase()```](#toUpperCase-and-toUpperCase)
- [DNA Sequencing Project](#DNA-Sequencing-Project)

## length

In Java, the ```length()``` string method returns the length ⁠— total number of characters ⁠— of a ```String```.

Suppose we have a ```String``` called ```str```, ```str.length()``` would return its length.

Take a look at this code for example:

```
String str = "Hello World!";  

System.out.println(str.length());
```

```12``` would be printed because ```str``` has 12 characters:

```H``` ```e``` ```l``` ```l``` ```o``` ```_``` ```W``` ```o``` ```r``` ```l``` ```d``` ```!```

In theory, the length of a ```String``` is the same as the [Unicode](https://en.wikipedia.org/wiki/Unicode) units of the ```String```. For example, escape sequences such as ```\n``` count as only one character.

Example code can be found in the [length](https://github.com/keldavis/Java-Practice/tree/master/Foundations/8.%20String%20Methods/length) folder

## concat

The ```concat()``` method concatenates one string to the end of another string. Concatenation is the operation of joining two strings together.

Suppose we have a ```String``` called ```str1``` and another ```String``` called ```str2```, using ```str1.concat(str2)``` would return ```str1``` with ```str2``` appended to the end of it.

For example:

```
String name = "Code";

name = name.concat("cademy");

System.out.println(name);
```

```Codecademy``` would be printed.

In the code block above, we changed the value of ```name``` by reassigning it with a new value. However, ```concat()``` doesn’t actually change the value of the original string.

Suppose we do something slightly different:

```
String name = "Code";

name.concat("cademy");

System.out.println(name);
```

Code would be printed instead.

Example code can be found in the [concat](https://github.com/keldavis/Java-Practice/tree/master/Foundations/8.%20String%20Methods/concat) folder

## equals

With objects, such as ```String```s, we can’t use the primitive equality operator ```==``` to check for equality between two strings. To test equality with strings, we use a built-in method called ```equals()```.

For example:

```
String flavor1 = "Mango";
String flavor2 = "Peach";

System.out.println(flavor1.equals("Mango"));
// prints true

System.out.println(flavor2.equals("Mango"));
// prints false
```

Side note, there’s also a ```equalsIgnoreCase()``` method that compares two strings without considering upper/lower cases.

Example code can be found in the [equals](https://github.com/keldavis/Java-Practice/tree/master/Foundations/8.%20String%20Methods/equals) folder

## indexOf

If we want to know the index of the first occurence of a character in a string, we can use the ```indexOf()``` method on a string.

Remember that the indices in Java start with 0:

```
String letters = "ABCDEFGHIJKLMN";

System.out.println(letters.indexOf("C"));
```

This would output ```2```.

Although ```C``` is the third letter in the English alphabet, it is located in the second index of the string.

Suppose we want to know the index of the first occurrence of an entire substring. The ```indexOf()``` instance method can also return where the substring begins (the index of the first character in the substring):

```
String letters = "ABCDEFGHIJKLMN";

System.out.println(letters.indexOf("EFG"));
```

This would output ```4```, because ```EFG``` starts at index 4.

If the ```indexOf()``` doesn’t find what it’s looking for, it’ll return a ```-1```.

Example code can be found in the [indexOf](https://github.com/keldavis/Java-Practice/tree/master/Foundations/8.%20String%20Methods/indexOf) folder

## charAt

The ```charAt()``` method returns the character located at a ```String```‘s specified index.

For example:

```
String str = "qwer";

System.out.println(str.charAt(2));
```

It would output ```e``` because that’s what’s at index 2. (Once again, indices start with 0.)

Suppose we try return the character located at index 4, it would produce an error because index 4 is out of ```str```‘s range.

Example code can be found in the [charAt](https://github.com/keldavis/Java-Practice/tree/master/Foundations/8.%20String%20Methods/charAt) folder

## substring

There may be times when we only want a part of a string. In such cases, we may want to extract a *substring* from a string.

The substring() method does exactly that. For example:

```
String line = "The Heav'ns and all the Constellations rung";

System.out.println(line.substring(23));
```

It would output ```Constellations rung``` because that’s what begins at index 23 and ends at the end of ```line```. The substring begins with the character at the specified index and extends to the end of the string.

But suppose we want a substring at the middle of the string. We can include two arguments with this string method. For example:

```
String line = "The Heav'ns and all the Constellations rung";

System.out.println(line.substring(23, 38));
```

It would output ```Constellations``` because that’s the substring that begins at index 23 and ends at index 38.

Example code can be found in the [substring](https://github.com/keldavis/Java-Practice/tree/master/Foundations/8.%20String%20Methods/substring) folder

## toUpperCase and toLowerCase

There will be times when we have a word in a case other than what we need it in. Luckily, Java has a couple ```String``` methods to help us out:

- ```toUpperCase()```: returns the string value converted to uppercase
- ```toLowerCase()```: returns the string value converted to lowercase

For example:

```
String input = "Cricket!";

String upper = input.toUpperCase();
// stores "CRICKET!"

String lower = input.toLowerCase();
// stores "cricket!"
```

A good use of this functionality is to ensure consistency of the data you store in a database. Making sure all of the data you get from a user is lowercase before you store it in your database will make your database easier to search through later.

Example code can be found in the [toUpperCase and toLowerCase](https://github.com/keldavis/Java-Practice/tree/master/Foundations/8.%20String%20Methods/toUpperCase%20and%20toLowerCase) folder

## DNA Sequencing Project

The genome of an organism stores all the genetic information necessary to build and maintain that organism. It is an organism’s complete set of DNA.

[DNA](https://en.wikipedia.org/wiki/DNA) is composed of a series of nucleotides abbreviated as:

- ```A```: Adenine
- ```C```: Cytosine
- ```G```: Guanine
- ```T```: Thymine

<img src="https://github.com/keldavis/Java-Practice/blob/master/Foundations/8.%20String%20Methods/dna.webp" alt="function" width="500"/>

So a strand of DNA could look something like ```ACGAATTCCG```.

Write a **DNA.java** program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

1. It begins with a “start codon”: ```ATG```.
2. It ends with a “stop codon”: ```TGA```.
3. In between, each additional codon is a sequence of three nucleotides.

So for example:

- ```ATGCGATACTGA``` is a protein because it has the start codon ```ATG```, the stop codon ```TGA```, and the length is divisible by 3.
- ```ATGCGATAGA``` is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.

Project details can be found in the [DNA Sequencing Project](https://github.com/keldavis/Java-Practice/tree/master/Foundations/8.%20String%20Methods/DNA%20Sequencing%20Project) folder