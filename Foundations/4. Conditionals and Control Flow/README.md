# Conditionals and Control Flow
### Alter the control flow of your programs with conditional statements. Learn how “if-then-else” statements give you power over which portions of your code will run.

- [If-Then Statement](#If-Then-Statement)
- [If-Then-Else](#If-Then-Else)
- [If-Then-Else-If](#If-Then-Else-If)
- [Switch Statement](#Switch-Statement)
- [Conditional-And: &&](#Conditional-AND)
- [Conditional-Or: ||](#Conditional-OR)
- [Logical NOT: !](#Logical-NOT)

Imagine we’re writing a program that enrolls students in courses.

- *If* a student has completed the prerequisites, *then* they can enroll in a course.
- *Else*, they need to take the prerequisite courses.

They can’t take Physics II without finishing Physics I.

We represent this kind of decision-making in our program using *conditional* or *control flow* statements. Before this point, our code runs line-by-line from the top down, but conditional statements allow us to be selective in which portions will run.

Conditional statements check a ```boolean``` condition and run a *block* of code depending on the condition. Curly braces mark the scope of a conditional block similar to a method or class.

Here’s a complete conditional statement:

```
if (true) {

  System.out.println("Hello World!");

}
```

If the condition is ```true```, then the block is run. So ```Hello World!``` is printed.

But suppose the condition is different:

```
if (false) {

  System.out.println("Hello World!");

}
```

If the condition is ```false```, then the block does not run.

This code is also called *if-then* statements: “If ```(condition)``` is ```true```, then do something”.

### If Then Statement

The *if-then* statement is the most simple control flow we can write. It tests an expression for truth and executes some code based on it.

```
if (flip == 1) {

  System.out.println("Heads!");

}
```

- The ```if``` keyword marks the beginning of the conditional statement, followed by parentheses ```()```.
- The parentheses hold a ```boolean``` datatype.

For the condition in parentheses we can also use variables that reference a boolean, or comparisons that evaluate to a boolean.

The boolean condition is followed by opening and closing curly braces that mark a block of code. This block runs if, and only if, the boolean is ```true```.

```
boolean isValidPassword = true;

if (isValidPassword) {

  System.out.println("Password accepted!");

}

// Prints "Password accepted!"

int numberOfItemsInCart = 9;

if (numberOfItemsInCart > 12) {

  System.out.println("Express checkout not available");

}

// Nothing is printed.
```

If a conditional is brief we can omit the curly braces entirely:

```
if (true) System.out.println("Brevity is the soul of wit");
```

**Note**: Conditional statements do not end in a semicolon.

Example code can be found in the [if-then](https://github.com/keldavis/Java-Practice/tree/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/if-then) folder.

### If Then Else

We’ve seen how to conditionally execute one block of code, but what if there are two possible blocks of code we’d like to execute?

Let’s say *if* a student has the required prerequisite, *then* they enroll in the selected course, *else* they’re enrolled in the prerequisite course instead.

We create an alternate conditional branch with the ```else``` keyword:

```
if (hasPrerequisite) {

  // Enroll in course

} else {

  // Enroll in prerequisite

}
```

This conditional statement ensures that exactly one code block will be run. If the condition, ```hasPrerequisite```, is ```false```, the block after ```else``` runs.

There are now two separate code blocks in our conditional statement. The first block runs if the condition evaluates to ```true```, the second block runs if the condition evaluates to ```false```.

This code is also called an *if-then-else* statement:

- If *condition* is true, then do something.
- Else, do a different thing.

Example code can be found in the [if-then-else](https://github.com/keldavis/Java-Practice/tree/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/if-then-else) folder.

### If Then Else If

The conditional structure we’ve learned can be chained together to check as many conditions as are required by our program.

Imagine our program is now selecting the appropriate course for a student. We’ll check their submission to find the correct course enrollment.

The conditional statement now has multiple conditions that are evaluated from the top down:

```
String course = "Theatre";

if (course.equals("Biology")) {

  // Enroll in Biology course

} else if (course.equals("Algebra")) {

  // Enroll in Algebra course

} else if (course.equals("Theatre")) {

  // Enroll in Theatre course

} else {

  System.out.println("Course not found!");

}
```

**The first** condition to evaluate to ```true``` will have that code block run. Here’s an example demonstrating the order:

```
int testScore = 72;

if (testScore >= 90) {

  System.out.println("A");

} else if (testScore >= 80) {

  System.out.println("B");

} else if (testScore >= 70) {

  System.out.println("C");

} else if (testScore >= 60) {

  System.out.println("D");

} else {

  System.out.println("F");

}
// prints: C
```

This chained conditional statement has two conditions that evaluate ```true```. Because ```testScore >= 70``` comes before ```testScore >= 60```, only the earlier code block is run.

**Note**: Only one of the code blocks will run.

Example code can be found in the [if-then-else-if](https://github.com/keldavis/Java-Practice/tree/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/if-then-else-if) folder.

### Switch Statement

An alternative to chaining if-then-else conditions together is to use the ```switch``` statement. This conditional will check a given value against any number of conditions and run the code block where there is a match.

Here’s an example of our course selection conditional as a ```switch``` statement instead:

```
String course = "History";

switch (course) {
  case "Algebra": 
    // Enroll in Algebra
    break; 
  case "Biology": 
    // Enroll in Biology
    break;
  case "History": 
    // Enroll in History
    break;
  case "Theatre":
    // Enroll in Theatre
    break;
  default:
    System.out.println("Course not found");
}
```

This example enrolls the student in History class by checking the value contained in the parentheses, ```course```, against each of the ```case``` labels. If the value after the case label matches the value within the parentheses, the *switch block* is run.

In the above example, ```course``` references the string ```"History"```, which matches ```case "History":```.

When no value matches, the ```default``` block runs. Think of this as the ```else``` equivalent.

Switch blocks are different than other code blocks because they are not marked by curly braces and we use the ```break``` keyword to exit the switch statement.

Without ```break```, code below the matching ```case``` label is run, *including code under other case labels*, which is rarely the desired behavior.

```
String course = "Biology";

switch (course) {
  case "Algebra": 
    // Enroll in Algebra
  case "Biology": 
    // Enroll in Biology
  case "History": 
    // Enroll in History
  case "Theatre":
    // Enroll in Theatre
  default:
    System.out.println("Course not found");
}

// enrolls student in Biology... AND History and Theatre!
```

Example code can be found in the [switch statement](https://github.com/keldavis/Java-Practice/tree/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/switch%20statement) folder.

### Conditional AND

Let’s return to our student enrollment program. We’ve added an additional requirement: not only must students have the prerequisite, but their tuition must be paid up as well. We have *two* conditions that must be ```true``` before we enroll the student.

Here’s one way we could write the code:

```
if (tuitionPaid) {
  if (hasPrerequisite) {
    // enroll student
  }
}
```

We’ve nested two ```if-then``` statements. This does the job but we can be more concise with the *AND* operator:

```
if (tuitionPaid && hasPrerequisite) {
  // enroll student
}
```

The AND operator, ```&&```, is used between two boolean values and evaluates to a single boolean value. If the values **on both sides** are ```true```, then the resulting value is ```true```, otherwise the resulting value is ```false```.

This code illustrates every combination:

```
true && true
// true
false && true
// false
true && false
// false
false && false
// false
```

Example code can be found in the [Conditional AND]() folder.

### Conditional OR

The requirements of our enrollment program have changed again. Certain courses have prerequisites that are satisfied by multiple courses. As long as students have taken **at least one** prerequisite, they should be allowed to enroll.

Here’s one way we could write the code:

```
if (hasAlgebraPrerequisite) {
  // Enroll in course
}

if (hasGeometryPrerequisite) {
  // Enroll in course
}
```

We’re using two different ```if-then``` statements with the **same code block**. We can be more concise with the *OR* operator:

```
if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
  // Enroll in course
}
```

The OR operator, ```||```, is used between two boolean values and evaluates to a single boolean value. If **either of the two values** is ```true```, then the resulting value is ```true```, otherwise the resulting value is ```false```.

This code illustrates every combination:

```
true || true
// true
false || true
// true
true || false
// true
false || false
// false
```

Example code can be found in the [Conditional OR](https://github.com/keldavis/Java-Practice/tree/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/Conditional%20OR) folder.

### Logical NOT

The *unary* operator NOT, ```!```, works on a **single** value. This operator evaluates to the opposite boolean to which it’s applied:

```
!false
// true
!true
// false
```

NOT is useful for expressing our intent clearly in programs. For example, sometimes we need the opposite behavior of an ```if-then```: run a code block **only if** the condition is ```false```.

```
boolean hasPrerequisite = false;

if (hasPrerequisite) {
  // do nothing
} else {
  System.out.println("Must complete prerequisite course!");
}
```

This code does what we want but it’s strange to have a code block that does nothing!

The logical NOT operator cleans up our example:

```
boolean hasPrerequisite = false;

if (!hasPrerequisite) {
  System.out.println("Must complete prerequisite course!");
}
```

We can write a succinct conditional statement without an empty code block.

Example code can be found in the [Logical NOT](https://github.com/keldavis/Java-Practice/tree/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/Logical%20NOT) folder.