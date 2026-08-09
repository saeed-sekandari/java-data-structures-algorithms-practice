//This program read the elements of the 2D array from the user.
import java.util.Scanner;
public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[2][2];
        System.out.println("Please enter the elments of the 2D array: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        int total=0;
        //find the sum of all the elements of array
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                total += matrix[i][j];

                System.out.printf("%5d",matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Some of all elements is: " + total);

    }
}
