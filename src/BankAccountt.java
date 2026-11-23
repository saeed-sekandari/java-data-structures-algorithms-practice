public class BankAccountt {
    private String owner;
    private double balance;

    BankAccountt(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if( amount >0) {
            balance += amount;
        }
        else {
            System.out.println("The amount should be more than zero.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
        else {
            System.out.println("The amount should be more than zero and not greater than the current amount.");
        }
    }

    public static void main(String[] args) {
        BankAccountt accountt = new BankAccountt("Ali", 5555.43);
        System.out.println(accountt.getBalance());
        accountt.deposit(50.0);
        accountt.withdraw(10);
        accountt.withdraw(30);
        System.out.println(accountt.getBalance());
    }
}
