Basic Comp Sci Questions

Computer Processing

1. What is hardware? What is software?
- The hardware of a computer system consists of its physical components such as a circuit board, monitor, or keyboard. Computer software consists of the programs that are executed by the hardware and the data that those programs use. Hardware is tangible, whereas software is intangible. In order to be useful, hardware requires software and software requires hardware.

2. What are the two primary functions of an operating system?
- The operating system provides a user interface and efficiently coordinates the use of resources such as main memory and the CPU.

3. The music on a CD is created using a sampling rate of 44,000 measurements per second. Each measurement is stored as a number that represents a specific voltage level. How many such numbers are used to store a three-minute long song? How many such numbers does it take to represent one hour of music?
- It takes 7,200,000 numbers for a three-minute song (40,000 3 60 3 3) and 144,000,000 numbers for one hour of music (40,000 3 60 3 60).

4. What happens to information when it is stored digitally?
- The information is broken into pieces, and those pieces are represented as numbers.

5. How many unique items can be represented with the following?
a. 2 bits
b. 4 bits
c. 5 bits
d. 7 bits
- In general, N bits can represent 2N unique items. Therefore:
a. 2 bits can represent 4 items because 22 5 4.
b. 4 bits can represent 16 items because 24 5 16.
c. 5 bits can represent 32 items because 25 5 32.
d. 7 bits can represent 128 items because 27 5 128

6. Suppose you want to represent each of the 50 states of the United States using a unique permutation of bits. How many bits would be needed to store each state representation? Why?
- It would take 6 bits to represent each of the 50 states. Five bits is not enough because 2^5 = 32 but six bits would be enough because 2^6 = 64.

Hardware Components

7. How many bytes are in each of the following?
a. 3 KB
b. 2 MB
c. 4 GB
- A kilobyte (KB) is 2^10 = 1,024 bytes, a megabyte (MB) is 2^20 = 1,048,576 bytes, and a gigabyte (GB) is 2^30 = 1,073,741,824 bytes. Therefore: 
a. 3 KB 5 3 * 1,024 bytes 5 3,072 bytes = approximately 3 thousand bytes
b. 2 MB 5 2 * 1,048,576 bytes 5 2,097,152 bytes = approximately 2.1 million bytes
c. 4 GB 5 4 * 1,073,741,824 bytes 5 4,294,967,296 bytes = approximately 4.3 billion bytes

8. How many bits are there in each of the following?
a. 8 bytes
b. 2 KB
c. 4 MB
- There are eight bits in a byte. Therefore:
a. 8 bytes = 8 * 8 bits = 64 bits
b. 2 KB = 2 * 1,024 bytes = 2,048 bytes = 2,048 * 8 bits = 16,384
bits
c. 4 MB = 4 * 1,048,576 bytes = 4,194,304 bytes = 4,194,304 * 8
bits = 33,554,432 bits

9. The music on a CD is created using a sampling rate of 44,000 measurements per second. Each measurement is stored as a number that represents a specific voltage level. Suppose each of these numbers requires two bytes of storage space. How many MB does it take to represent one hour of music?
- Under the stated conditions, one hour of music would require 288,000,000 bytes (40,000 3 60 3 60 3 2). Dividing this number by the number of bytes in a megabyte (1,048,576 bytes) gives approximately 275 MB. Note that a typical audio CD has a capacity of about 650 MB and can store about 70 minutes of music. This coincides with an actual sampling rate of 41,000 measurements per second, two bytes of storage space per measurement, and the need to store two streams of music to produce a stereo effect.

10. What are the two primary hardware components in a computer? How do they interact?
- The two primary hardware components are main memory and the CPU. Main memory holds the currently active programs and data. The CPU retrieves individual program instructions from main memory, one at a time, and executes them.

11. What is a memory address?
- A memory address is a number that uniquely identifies a particular memory location in which a value is stored.

12. What does volatile mean? Which memory devices are volatile and which are nonvolatile?
- Main memory is volatile, which means the information that is stored in it will be lost if the power supply to the computer is turned off. Secondary memory devices are nonvolatile; therefore, the information that is stored on them is retained even if the power goes off.

13. Select the word from the following list that best matches each of the following phrases: 
controller, CPU, main, network card, peripheral, RAM, register, ROM, secondary 
a. Almost all devices in a computer system, other than the CPU and the main memory, are categorized as this.
b. A device that coordinates the activities of a peripheral device.
c. Allows information to be sent and received.
d. This type of memory is usually volatile.
e. This type of memory is usually nonvolatile.
f. This term basically is interchangeable with the term “main memory.”
g. Where the fundamental processing of a computer takes place.
- The word that best matches is
a. peripheral b. controller c. modem d. main or RAM e. secondary or ROM f. RAM g. CPU

networks

14. What is a file server?
- A file server is a network computer that is dedicated to storing and providing programs and data that are needed by many network users.

15. What is the total number of communication lines needed for a fully connected point-to-point network of five computers? Six computers?
- Counting the number of unique connections in Figure 1.16, there are 10 communication lines needed to fully connect a point-to-point network of five computers. Adding a sixth computer to the network will require that it be connected to the original five, bringing the total to 15 communication lines.

16. Describe a benefit of having computers on a network share a communication line. Describe a cost/drawback of sharing a communication line.
- Having computers on a network share a communication line is cost effective because it cuts down on the number of connections needed and it also makes it easier to add a new computer to the network. Sharing lines, however, can mean delays in communication if the network is busy.

17. What is the etymology of the word Internet?
- The word Internet comes from the word internetworking, a concept related to wide-area networks (WANs). An internetwork connects one network to another. The Internet is a WAN.

18. The TCP/IP set of protocols describes communication rules for software that uses the Internet. What does TCP stand for? What does IP stand for?
- TCP stands for Transmission Control Protocol. IP stands for Internet Protocol. A protocol is a set of rules that govern how two things communicate.

19. Explain the parts of the following URLs:
a. duke.csc.villanova.edu/jss/examples.html
b. java.sun.com/products/index.htm
- Breaking down the parts of each URL:
a. duke is the name of a computer within the csc subdomain (the Department of Computing Sciences) of the villanova.edu domain, which represents Villanova University. The edu top-level domain indicates that it is an educational organization. This URL is requesting a file called examples.html from within a subdirectory called jss.
b. java is the name of a computer (Web server) at the sun.com domain, which represents Sun Microsystems, Inc. The com top level domain indicates that it is a commercial business. This URL is requesting a file called index.html from within a subdirectory called products.

The Java Programming Language

20. When was the Java programming language developed? By whom? When was it introduced to the public?
- The Java programming language was developed in the early 1990s by James Gosling at Sun Microsystems. It was introduced to the public in 1995.

21. Where does processing begin in a Java application?
- The processing of a Java application begins with the main method.

22. What do you predict would be the result of the following line in a Java program? 
System.out.println("Hello"); // prints hello
- The characters “Hello” will be printed on the computer screen.

23. What do you predict would be the result of the following line in a Java program? 
// prints hello System.out.println("Hello");
- The entire line of code is a comment, so there is no result.

24. Which of the following are not valid Java identifiers? Why? 
a. RESULT
b. result
c. 12345
d. x12345y
e. black&white
f. answer_7
- All of the identifiers shown are valid except 12345 (since an identifier cannot begin with a digit) and black&white (since an identifier cannot contain the character &). The identifiers RESULT and result are both valid, but should not be used together in a program because they differ only by case. The underscore character (as in answer_7) is a valid part of an identifier.

25. Suppose a program requires an identifier to represent the sum of the test scores of a class of students. For each of the following names, state whether or not each is a good name to use for the identifier. 
Explain your answers.
a. x
b. scoreSum
c. sumOfTheTestScoresOfTheStudents
d. smTstScr
- Although any of the listed names could be used as the required identifier, the only “good” choice is scoreSum. The identifier x is not descriptive and is meaningless, the identifier sumOfTheTestScoresOfTheStudents is unnecessarily long, and the identifier smTstScr is unclear.

26. What is white space? How does it affect program execution? How does it affect program readability?
- White space is a term that refers to the spaces, tabs, and newline characters that separate words and symbols in a program. The compiler ignores extra white space; therefore, it doesn’t affect execution. However, it is crucial to use white space appropriately to make a program readable to humans.

Program development

27. We all know that computers are used to perform complex jobs. However, a computer’s instructions can do only simple tasks. Explain this apparent contradiction.
- At the lowest level, a computer’s instructions perform only simple tasks, such as copying a value or comparing two numbers. However, by putting together millions of these simple instructions every second, a computer can perform complex tasks.

28. What is the relationship between a high-level language and a machine language? 
- High-level languages allow a programmer to express a series of program instructions in English-like terms that are relatively easy to read and use. However, in order to execute, a program must be expressed in a particular computer’s machine language, which consists of a series of bits that are basically unreadable by humans. A high-level language program must be translated into machine language before it can be run.

29. What is Java bytecode? 
- Java bytecode is a low-level representation of a Java source code program. The Java compiler translates the source code into bytecode, which can then be executed using the Java interpreter. The bytecode might be transported across the Web before being executed by a Java interpreter that is part of a Web browser.

30. Select the word from the following list that best matches each of the
following phrases:
 assembly, compiler, high-level, IDE, interpreter, Java, low-level, machine
a. A program written in this type of language can run directly on a
computer. 
b. Generally, each language instruction in this type of language
corresponds to an equivalent machine language instruction.
c. Most programmers write their programs using this type of
language.
d. Java is an example of this type of language.
e. This type of program translates code in one language to code in
another language.
f. This type of program interweaves the translation of code and the
execution of the code.
- The word that best matches is
a. machine b. assembly c. high-level d. high-level
e. compiler f. interpreter

31. What do we mean by the syntax and semantics of a programming language?
- Syntax rules define how the symbols and words of a programming language can be put together. The semantics of a programming language instruction determine what will happen when that instruction is executed.

32. Categorize each of the following situations as a compile-time error,
run-time error, or logical error. 
a. Misspelling a Java reserved word.
b. Calculating the average of an empty list of numbers by dividing
the sum of the numbers on the list (which is zero) by the size of
the list (which is also zero).
c. Printing a student’s high test grade when the student’s average test
grade should have been output
- a. Compile-time error b. Run-time error (you cannot divide by
zero) c. Logical error

Object-Oriented Programming

33. List the five general steps required to solve a problem.
- 1. Understand the problem.
 2. Design a solution.
 3. Consider alternatives and refinements to the solution.
 4. Implement the solution.
 5. Test the solution.

 34. Why is it important to consider more than one approach to solving a problem? Why is it important to consider alternatives early in the process of solving a problem?
 - The first solution to a problem that we think of may not be a good one. By considering alternative solutions before expending too much energy implementing our first idea, we can often save overall time and effort.

 35. What are the primary concepts that support object-oriented programming?
 - The primary elements that support object-oriented programming are objects, classes, encapsulation, and inheritance. An object is defined by a class, which contains methods that define the operations on those objects (the services that they perform). Objects are encapsulated such that they store and manage their own data. Inheritance is a reuse technique in which one class can be derived from another.