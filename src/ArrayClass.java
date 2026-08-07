//Perform some operations using the array class

import java.util.Arrays;
public class ArrayClass {
    public static void main(String[] args) {
        int[] numbers = {23, 55, 66, 8, 9, 24, 3, 7, 99, 2};
        System.out.println("The original array is: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("The sorted array is: " + Arrays.toString(numbers));
        int index = Arrays.binarySearch(numbers,7);
        System.out.println("The index of the number we are looking for is: " + index );
    }
}
