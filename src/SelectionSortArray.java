//Sort this array using selection sort
//[55,32,8,99,1,15]

import java.util.Arrays;
public class SelectionSortArray {
    public static void selectionSort(int[] numbers){
        for (int i=0; i<numbers.length; i++){
            int minIndex = i;
            for(int j=i+1; j<numbers.length;j++){
                if(numbers[j] < numbers[minIndex]){
                    minIndex=j;
                }
            }
            int temp = numbers[i];
            numbers [i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
    }
    public static void main(String[] args){
        int[] numbers = {55,32,8,99,1,15};
        selectionSort(numbers);
        System.out.println("The sorted array is: " + Arrays.toString(numbers));
    }
}
