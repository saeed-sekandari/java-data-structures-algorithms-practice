import java.util.Arrays;

/* Write a Java method called binarySearch that receives a sorted integer array and
 a target number, searches for the target by repeatedly examining the middle element
  and eliminating the half where the target cannot exist, returns the target’s index
  if it is found, and returns -1 if it is not found; then test the method in main using
   the array {1, 3, 5, 7, 9, 11, 13, 15, 17, 19} and the target 7.
 */
public class BinarySearchPractice {
    //perform binary search with this method
    public static int binarySearch(int[] array, int target){
        //first sort the array before search
        Arrays.sort(array);

        int low = 0; //lowest index of the array
        int high = array.length -1; //highest index of the array

        while (low <= high){
            int mid = (high + low)/2; //middle index of the array
            if(array[mid] == target){
                return mid;
            } else if (array[mid] < target) {
                low = mid +1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // if the target not found return -1
    }

    public static void main(String[] args) {
        int[] array = {3,8, 1, 0, 21, 6, 16, 30, 10};
        int target = 16;
        int result = binarySearch(array, target); //store the result of the search
        System.out.println("The sorted array is: " + Arrays.toString(array));
        System.out.println("The target element of the array is: " + target);
        if( result == -1){
            System.out.println("The target element of the array was not found!");
        }else {
            System.out.println("The target element of the array was found in index " + result);
        }
    }
}