public class BankAccount {
  private String ownerName;
  private String accountNumber;
  private double balance;

  private static int numOfAccountNumber;

  //constructor to update bank account info
  public BankAccount(){
      ownerName = "unknown";
      accountNumber = "unknown";
      balance = 0;

      numOfAccountNumber++;
  }
  //constructor to update the bank account info
  public BankAccount(String ownerName, String accountNumber, double balance){
      this.ownerName = ownerName;
      this.accountNumber = accountNumber;
      this.balance = balance;

      numOfAccountNumber++;
  }
  //getter method to get the account number
  public String getAccountNumber(){
      return accountNumber;
  }
  //setter method to set the account number
    public void  setAccountNumber(String newAccountNumber){
      accountNumber = newAccountNumber;
    }
  //getter method to get the owner's name
    public String getOwnerName(){
      return ownerName;
    }
    //setter method to update the owner name
    public void setNewOwnerName(String newOwnerName){
      ownerName = newOwnerName;
    }
    //getter method to get the balance
    public double getBalance(){
      return balance;
    }
    //deposit method
    public void deposit( double amount){
      if(amount>0){
          balance+= amount;
      }
      else
          System.out.println("Invalid amount!");
    }
    //withdraw method
    public void withdraw(double amount){
      if(amount>0 && amount<= balance){
          balance-= amount;
      }
      else
          System.out.println("Invalid amount");
    }
    //method to display the account info
    public void display(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Owner name: " + ownerName);
        System.out.println("Balance: " + balance);
    }
    //getter method to display the number of account created
    public static int  getTotalNumOfAccount(){
      return numOfAccountNumber;
    }

}
