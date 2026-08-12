public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    static int numberOfAccounts;

    public BankAccount(){
        accountNumber = "Unknown";
        ownerName = "Unknown";
        balance = 0;
        numberOfAccounts++;
    }

    public BankAccount(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        numberOfAccounts++;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(String newAccountNumber){
        accountNumber = newAccountNumber;
    }

    public void setOwnerName(String newOwnerName){
        ownerName = newOwnerName;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
        else{
            System.out.println("You need to deposit at least one cent!");
        }
    }
    public static void depositMoney(BankAccount account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount){
        if(amount > 0 && amount<= balance){
            balance -= amount;
        }
        else {
            System.out.println("Not a valid withdraw!");
        }
    }

    public static int getNumOfAccounts(){
        return numberOfAccounts;
    }
    public void displayAccount(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}
