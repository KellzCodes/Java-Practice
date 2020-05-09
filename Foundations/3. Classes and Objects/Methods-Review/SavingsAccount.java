public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is "+ balance);
  }
  
  public void deposit(int amountToDeposit){
    balance = amountToDeposit + balance;
    System.out.println("You just deposited " + amountToDeposit);
  }
  
  public int withdraw(int amountToWithdraw){
    balance = balance - amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }
  
  public String toString(){
    return "This is a checking account with " + balance + " saved.";
  }
  
  public static void main(String[] args){
    SavingsAccount checking = new SavingsAccount(2000);
    
    //Check balance:
    checking.checkBalance();
    
    //Withdrawing:
    checking.withdraw(300);
    
    //Check balance:
    checking.checkBalance();
    
    //Deposit:
    checking.deposit(600);
    
    //Check balance:
    checking.checkBalance();
    
    //Deposit:
    checking.deposit(600);
    
    //Check balance:
    checking.checkBalance();
    
    System.out.println(checking);
  }       
}
