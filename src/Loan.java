import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    //default constructor
    public Loan(){
        this(2.5, 1, 1000);
    }
    //construct a loan with specified annual rate, number of years, loan amount and date
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
         this.annualInterestRate = annualInterestRate;
         this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }
    //Return annual interest rate
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    //Set a new annual interest rate
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    //return the number of years
    public int getNumberOfYears(){
        return numberOfYears;
    }
    //set a new number of years for loan
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }
    //Return the loan amount
    public double getLoanAmount(){
        return loanAmount;
    }
    //set a new loan amount
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    //return the loan date
    public Date getLoanDate(){
        return loanDate;
    }

    //calculate the monthly payment
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / ( 1-1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        return monthlyPayment;
    }
    //return the total payment
    public double getTotalPayment(){
        double totalPayment = (getMonthlyPayment() * numberOfYears * 12);
        return totalPayment;
    }

}