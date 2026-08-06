/*
* This program asks the user for the number of array elements.
        * It then reads the elements into an array.
        * Next, it calculates the average of the elements.
        * Finally, it displays the average and the number of
        * elements that are greater than the average.
        */
import java.util.Scanner;
public class FindTheNumberOfItemsAboveTheAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        double sum = 0;

        System.out.println("Enter the array elemnts numbers:");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
            int count = 0;
            double average = sum / n;
            for(int i=0; i < numbers.length; i++){
                if(numbers[i] > average ){
                    count++;
            }
        }
        System.out.println("The number of items is " + n);
        System.out.println("The averge is " + average);
        System.out.println("The number of items grater than the average is " + count);
    }
}
