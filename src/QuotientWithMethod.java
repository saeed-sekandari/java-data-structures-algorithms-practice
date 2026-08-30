import java.util.Scanner;

public class QuotientWithMethod {
    /*//A method to divide two numbers
    public static int quotient(int number1, int number2){
        //handle the exception
        if(number2 == 0){
            System.out.println("Cannot divide by zero");
            System.exit(1);//means end the program
        }
        return number1/number2;
    }

    public static void main(String[] args) {
        System.out.println(quotient(3,0));
    }*/
    //method to divide one number by another number
    public static int quotient(int number1, int number2){
        if(number2 == 0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1/number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter number2: ");
        int number2 = input.nextInt();
        try {
            int result = quotient(number1,  number2);
            System.out.println(number1 + " / " + number2 + " = " + result);
        }
        catch (ArithmeticException ex){
            System.out.println("Exception: An Integer cannot divide by zero");
        }
        System.out.println("Continue...");
    }
}
