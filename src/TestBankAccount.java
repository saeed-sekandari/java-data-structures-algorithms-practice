public class TestBankAccount {

    public static void main(String[] args) {

        // Create an array of BankAccount references
        BankAccount[] accounts = new BankAccount[3];

        // Create BankAccount objects
        accounts[0] = new BankAccount("1001", "Saeed", 1000);
        accounts[1] = new BankAccount("1002", "Ali", 500);
        accounts[2] = new BankAccount("1003", "John", 2000);

        // Display all accounts
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account " + (i + 1));
            accounts[i].displayAccount();
            System.out.println();
        }

        // Deposit money
        accounts[0].deposit(500);

        // Withdraw money
        accounts[1].withdraw(200);

        // Pass an object to a method
        depositMoney(accounts[2], 300);

        // Reference variable
        BankAccount anotherAccount = accounts[0];
        anotherAccount.deposit(100);

        // Display updated accounts
        System.out.println("After transactions:");

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayAccount();
            System.out.println();
        }

        // Static method
        System.out.println(
                "Total number of accounts: "
                        + BankAccount.getNumOfAccounts()
        );
    }

    public static void depositMoney(BankAccount account, double amount) {
        account.deposit(amount);
    }
}