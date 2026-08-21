import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt the user to enter the annual interest rate
        System.out.println("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        //prompt teh user for the number of years
        System.out.println("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        //prompt the user for loan amount
        System.out.println("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        //Create an object of the Loan class
        Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);
        //display the loan date
        System.out.println("The loan started date is: " + loan.getLoanDate());
        //display the monthly payment
        System.out.println("The monthly payment is: " + loan.getMonthlyPayment());
        //display the total payment
        System.out.println("The total payment after loan period will be: " + loan.getTotalPayment());
    }
}
