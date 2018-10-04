public class BankAccount{
  //Instance variables
  private double balance;
  private int accountID; //the account number, an integer
  private String password;/*Sole constructor requires all field's values*/
  //1. A constructor: Should accept values for EACH of the instance variables
   public BankAccount(int OrigaccountID, double Origbalance, String Origpassword){
    accountID = OrigaccountID;
    balance = Origbalance;
    password = Origpassword;
  }
  /*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */

  //2. A toString method that returns (tab separated values): "AccountID\tBalance"
  //e.g. "100203    1023.45"
  public String toString(){
    return getAccountID() + "\t" + getBalance();
  }

  //3. get methods for balance, accountID
  /*standard accessor methods*/
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  //For testing purposes:
  public String getPassword(){
    return password;
  }

  //4. set method for password
  /*Change the value of password to the specified value
   *@param newPass The value to replace the old password with*/
  public void setPassword(String newPass){
    password = newPass;
  }

  //5a. A method to deposit money into the account. It should accept an amount of money,
      //and increase the account balance by that much and return true. This should not apply
      //a negative deposit, instead it should leave the balance unchanged and returning false.
  //5b. Method to withdraw money from the account and return true if it was successful,
      //false otherwise. This will not be successful if the balance is too low, in which case
      //the action does not change the balance.
  //6. A main method (included in the same file) to test your code.
      //Since withdraw and deposit return booleans. We can use them as follows:
      //hint:
      //if( var.withdraw(1000) ){
          //println("Withdrawal success!");
      //}else{
          //println("Withdrawal failure");
      //}

/*When amount is positive: Increase balance by amount and return true.
 *@return When amount is positive: Return true, otherwise return false.
 *@param amount The amount is how much to change the balance by.
 */
  //public boolean deposit(double amount){...}

/*When amount is positive and the amount is at least as much as the balance:
 *Decrease balance by amount if the balance is large enough.
 *Make no change if the amount is too large to withdraw
 *@param amount The amount is how much to change the balance by.
 *@return true when the balance is large enough, false otherwise.
 */
  //public boolean withdraw(double amount){... }

}
