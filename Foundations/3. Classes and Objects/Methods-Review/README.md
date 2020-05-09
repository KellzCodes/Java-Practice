# Methods: Review

1. Start with this code:

```
public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Withdrawing:
    int afterWithdraw = savings.balance - 300;
    savings.balance = afterWithdraw;
    System.out.println("You just withdrew "+300);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit = savings.balance + 600;
    savings.balance = afterDeposit;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
  }       
}

```

2. Now that we’ve learned about behavior, we can apply behavior to our ```CheckingAccount``` class using methods!

	We’ve added the functionality for each method inside ```main()``` now, but you will be rebuilding each above ```main()```. Note that your methods can directly access the ```balance``` field.

	First, write a method called ```checkBalance()``` that prints:
	> Hello! Your balance is

	with the balance of the account displayed.

	It should take in no parameters and return nothing.

3. Now, write a method called ```deposit()``` that takes in an ```int``` parameter ```amountToDeposit``` and adds it to the balance. It should return nothing.

	If you want, you can also have the method print:
	> You just deposited amountToDeposit

	with the value of ```amountToDeposit``` displayed.

4. Test out your methods by trying to replace some of the code in the ```main()``` method with the equivalent methods!

	Make sure to use ```checkBalance()```, ```deposit()```, and ```withdraw()``` at least once each.

5. Congratulations! You’ve made a basic ```SavingsAccount```.

	If you want, you can add more functionality to this! What other instance fields might you want to keep track of? What might a ```toString()``` look like for this class?

Example code can be found in the [SavingsAccount.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Methods-Review/SavingsAccount.java) file.