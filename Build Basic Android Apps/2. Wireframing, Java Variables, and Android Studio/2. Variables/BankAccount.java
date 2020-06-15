public class BankAccount {
  	public static void main(String[] args){
      double balance = 1000.75;
      double amountToWithdraw = 250;
      
      /*
      create a new double variable called 
      updatedBalance, and store balance 
      with amountToWithdraw subtracted 
      from it.
      */
      double updatedBalance = balance - amountToWithdraw;
      /*
      Create a double variable called 
      amountForEachFriend that holds 
      your updated balance divided by 3.
      */
      double amountForEachFriend = updatedBalance / 3;
      /*
      Create a boolean called canPurchaseTicket and 
      set it equal to whether or not amountForEachFriend 
      is at least enough to purchase a $250 concert 
      ticket.
      */
      boolean canPurchaseTicket = amountForEachFriend >= 250;
    // print canPurchaseTicket
      System.out.println(canPurchaseTicket);
      System.out.println("I gave each friend " + amountForEachFriend + "...");
    }       
}
