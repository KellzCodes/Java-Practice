# DNA Sequencing Project

1. Start with this code

```
public class DNA {

  public static void main(String[] args) {

    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-

  }

}
```

2. Write a comment near the top of the program that describe what the program does.

3. Here are the three DNA strands that you are going to use to test your program:

	- ```"ATGCGATACGCTTGA"```
	- ```"ATGCGATACGTGA"```
	- ```"ATTAATATGTACTGA"```

	Store them in different strings: ```dna1```, ```dna2```, and ```dna3```.

4. Create a generic ```String``` variable called ```dna``` that can be set to any DNA sequence (```dna1```, ```dna2```, ```dna3```).

5. To warm up, find the length of the ```dna``` string.

6. Remember that a protein has the following qualities:

	1. It begins with a start codon ```ATG```.
	2. It ends with a stop codon ```TGA```.
	3. In between, the number of nucleotides is divisible by 3.

	First, let’s start with the first condition. Does the DNA strand have the start codon ```ATG``` within it?

	Find the index where ```ATG``` begins using ```indexOf()```.

7. Next, does the DNA strand have the stop codon ```TGA```?

	Find the index where ```TGA``` begins.

8. Lastly, you’ll find out whether or not there is a protein!

	Let’s start with an ```if``` statement that checks for a start codon and a stop codon using the ```&&``` operator.

	Remember that the ```indexOf()``` string method will return ```-1``` if the substring doesn’t exist within a ```String```.

9. Add a third condition that checks whether or not that the number of nucleotides in between the start codon and the stop condon is a multiple of 3.

	Remember that the modolo operator ```%``` returns the remainder of a division.

10. Inside the ```if``` statement, create a ```String``` variable named ```protein```.

	And find this protein in the ```dna``` by using the ```substring()``` string method. Think about where you want the substring to begin and where you want the substring to end.

	Remember that a codon is 3 nucleotides long.

11. Add an ```else``` clause that print out ```No protein.```.

12. You are all done!

	Let’s test your code with each DNA strand. These should be the results:

	- ```dna1```: Contains a protein.
	- ```dna2```: Does not contain a protein.
	- ```dna3```: Contains a protein.