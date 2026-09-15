import java.util.Arrays;

public class RemoveDuplicates {
//method to remove duplicate from an array
    public static int[] removeDuplicates(int[] array) {

        // TODO 1: Check if array is null or has one element or less
        if(array == null || array.length <= 1){
            return array;
        }
        // TODO 2: Sort the array
        Arrays.sort(array);

        // Create a temporary array
        int[] temp = new int[array.length];
        // Index for the temporary array
        int j = 0;

        // TODO 3: Create a loop.
        // Remember: you compare array[i] with array[i + 1]
        for (int i=0; i < array.length-1; i++){
            if(array[i] != array[i +1]){
                temp[j++] = array[i];
            }
        }


        // TODO 4: Copy the last element into temp
        temp[j++] = array[array.length - 1];


        // TODO 5: Create a result array with the correct size
        int [] result = new int[j];


        // TODO 6: Copy values from temp into result
        for (int i=0; i< j; i++){
            result[i] = temp[i];
        }

        // TODO 7: Return result
        return result;

    }

    public static void main(String[] args) {

        int[] array = {4, 5, 9, 4, 2, 2, 8, 9, 1, 3, 6, 1};

        int[] uniqueArray = removeDuplicates(array);

        System.out.println(
                "Array with duplicates removed: "
                        + Arrays.toString(uniqueArray)
        );
    }
}