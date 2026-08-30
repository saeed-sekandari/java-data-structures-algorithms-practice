import java.util.InputMismatchException;
import java.util.Scanner;

public class Withdraw {
    public static void withdraw(double withdrawAmount, double balance)
            throws InsufficientBalanceException {

        if (withdrawAmount <= 0) {
            throw new IllegalArgumentException(
                    "Withdraw amount cannot be zero or negative"
            );
        }

        if (withdrawAmount > balance) {
            throw new InsufficientBalanceException(
                    "Withdraw amount cannot be bigger than balance"
            );
        }

        double remainingBalance = balance - withdrawAmount;
        System.out.println("Withdraw successful");
        System.out.println("Remaining balance: " + remainingBalance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter the balance: ");
            double balance = input.nextDouble();

            System.out.println("Enter the withdraw amount: ");
            double withdrawAmount = input.nextDouble();

            withdraw(withdrawAmount, balance);
        }
        catch (InputMismatchException ex) {
            System.out.println("Please enter numbers only");
        }
        catch (InsufficientBalanceException ex) {
            System.out.println(ex.getMessage());
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("continue...");
    }
}