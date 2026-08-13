public class TestBankAccount {

    //Practice passing an object through method
    public static void depositMoney(BankAccount bankAccounts, double amount ){
        bankAccounts.deposit(amount);
    }
    public static void main(String[] args) {
        //Array of bank account references
        BankAccount[] bankAccounts = new BankAccount[3];
        //Create 3 bank accounts objects
        bankAccounts[0] = new BankAccount("Saeed","1224435",1000000.44);
        bankAccounts[1] = new BankAccount("Yasamin", "00042288555",1244433.3);
        bankAccounts[2] = new BankAccount("Ali","3297744",10500.44);

        //Display original accounts
        for(int i=0; i< bankAccounts.length; i++ ){
            System.out.println("Account: " + (i+1));
            bankAccounts[i].display();
            System.out.println();
        }
        //deposit normally
        bankAccounts[0].deposit(20000);
        System.out.println(bankAccounts[0].getOwnerName()+" Balance after first deposit: " + bankAccounts[0].getBalance());

        //withdraw
        bankAccounts[1].withdraw(500);

        //two reference pointing at the same object
        depositMoney(bankAccounts[0], 10000);
        System.out.println(bankAccounts[0].getOwnerName()+" Balance after second deposit: " + bankAccounts[0].getBalance());
        System.out.println();
        bankAccounts[2].deposit(-388);
        System.out.println();

        //Display all accounts after transactions
        for(int i=0; i< bankAccounts.length; i++){
            bankAccounts[i].display();
            System.out.println();
        }

        BankAccount account = new BankAccount();
        account.setNewOwnerName("Zaher");
        System.out.println("New account owner name: " + account.getOwnerName());
        account.setAccountNumber("000000000");
        System.out.println("New account number: " + account.getAccountNumber());

        //show the total number of accounts
        System.out.println("Total number of account created: " + BankAccount.getTotalNumOfAccount());
    }
}