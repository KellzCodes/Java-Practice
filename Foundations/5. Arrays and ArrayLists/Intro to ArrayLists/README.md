# Intro to ArrayLists

In **Shopping.java** we’ve defined two arrays:

- ```groceryItems```, a ```String``` array
- ```prices```, a ```double``` array

We’ve tried to add a new item to the end of each. Open [Shopping.java](). Run the code — does it work?


Hint:

You should see an ```ArrayIndexOutOfBoundsException``` thrown because the length of each array was already set and there’s no room left!

This is a situation where an ```ArrayList``` would help.