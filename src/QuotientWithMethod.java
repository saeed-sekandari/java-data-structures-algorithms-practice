public class QuotientWithMethod {
    //A method to divide two numbers
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
    }
}
